package com.example.sistemadecitas;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre, etTelefono;
    private RadioGroup rgEspecie;
    private SwitchCompat swcUrgencia;
    private Button btnFecha, btnHora, btnRegistrar;
    private TextView tvFecha, tvHora;
    private ListView lvCitas;
    private String fechaSeleccionada = "", horaSeleccionada = "";
    private ArrayList<Cita> listaCitas;
    private CitaAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombreMascota);
        etTelefono = findViewById(R.id.etTelefonoPropietario);
        rgEspecie = findViewById(R.id.rgEspecie);
        swcUrgencia = findViewById(R.id.swcUrgencia);
        btnFecha = findViewById(R.id.btnFecha);
        btnHora = findViewById(R.id.btnHora);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        tvFecha = findViewById(R.id.tvFecha);
        tvHora = findViewById(R.id.tvHora);
        lvCitas = findViewById(R.id.lvCitas);

        listaCitas = new ArrayList<>();
        adaptador = new CitaAdapter(this, listaCitas);
        lvCitas.setAdapter(adaptador);

        // Inicializar fecha y hora con el momento actual por defecto si no se seleccionan manualmente
        inicializarFechaHoraActual();

        // DatePickerDialog: corrección de mes (+1)
        btnFecha.setOnClickListener(v -> {
            Calendar c = Calendar.getInstance();
            DatePickerDialog dpd = new DatePickerDialog(MainActivity.this, (view, year, month, dayOfMonth) -> {
                fechaSeleccionada = String.format("%02d/%02d/%d", dayOfMonth, (month + 1), year);
                tvFecha.setText(fechaSeleccionada);
            }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
            dpd.show();
        });

        // TimePickerDialog: formato 24h y relleno %02d en minutos
        btnHora.setOnClickListener(v -> {
            Calendar c = Calendar.getInstance();
            TimePickerDialog tpd = new TimePickerDialog(MainActivity.this, (view, hourOfDay, minute) -> {
                horaSeleccionada = String.format("%02d:%02d", hourOfDay, minute);
                tvHora.setText(horaSeleccionada);
            }, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), true);
            tpd.show();
        });

        // Registro de cita
        btnRegistrar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString().trim();
            String tlf = etTelefono.getText().toString().trim();

            if (nombre.isEmpty()) {
                Toast.makeText(this, "Por favor, introduzca el nombre de la mascota", Toast.LENGTH_SHORT).show();
                etNombre.requestFocus();
                return;
            }

            // Si el teléfono no se ha introducido, establecer un valor por defecto
            if (tlf.isEmpty()) {
                tlf = "Sin teléfono";
            }

            // Si por algún motivo la fecha u hora están vacías, asignar la actual
            if (fechaSeleccionada.isEmpty() || horaSeleccionada.isEmpty()) {
                inicializarFechaHoraActual();
            }

            String especie = "Perro";
            int icono = R.drawable.ic_perro;
            if (rgEspecie.getCheckedRadioButtonId() == R.id.rbGato) {
                especie = "Gato";
                icono = R.drawable.ic_gato;
            } else if (rgEspecie.getCheckedRadioButtonId() == R.id.rbExotico) {
                especie = "Exótico";
                icono = R.drawable.ic_exotico;
            }

            listaCitas.add(new Cita(nombre, especie, fechaSeleccionada, horaSeleccionada,
                    swcUrgencia.isChecked(), tlf, icono));
            adaptador.notifyDataSetChanged();

            Toast.makeText(this, R.string.cita_registrada, Toast.LENGTH_SHORT).show();

            // Limpiar los campos del formulario tras registrar con éxito
            etNombre.setText("");
            etTelefono.setText("");
            rgEspecie.check(R.id.rbPerro);
            swcUrgencia.setChecked(false);
            inicializarFechaHoraActual();

            // Ocultar teclado virtual
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null && getCurrentFocus() != null) {
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            }
        });

        // Intent Explícito al pulsar en un elemento de la lista
        lvCitas.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, DetalleCitaActivity.class);
            intent.putExtra("cita", listaCitas.get(position));
            startActivity(intent);
        });
    }

    private void inicializarFechaHoraActual() {
        Calendar c = Calendar.getInstance();
        fechaSeleccionada = String.format("%02d/%02d/%d", c.get(Calendar.DAY_OF_MONTH), (c.get(Calendar.MONTH) + 1), c.get(Calendar.YEAR));
        horaSeleccionada = String.format("%02d:%02d", c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE));
        tvFecha.setText(fechaSeleccionada);
        tvHora.setText(horaSeleccionada);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_web) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://site.educa.madrid.org/")));
            return true;
        } else if (id == R.id.menu_telefono) {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:918765432")));
            return true;
        } else if (id == R.id.menu_mapa) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.482537,-3.364279")));
            return true;
        } else if (id == R.id.menu_rotar) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}