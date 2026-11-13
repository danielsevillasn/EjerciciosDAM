package com.example.modeloexamensixnations;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ListView lvListaJugadores;
    private Button btnNuevoJugador, btnCancelar, btnGuardar;
    private EditText etNombreJugador, etValoracion;
    private ImageView imgBandera;
    private Spinner spNacionalidad;
    private View dialogView;
    private String[] nacionalidad = {"Elije Nacionalidad", "Inglaterra", "Escocia", "Gales", "Irlanda", "Francia", "Italia"};
    private int[] banderas = {R.drawable.six_nations, R.drawable.inglaterra, R.drawable.escocia, R.drawable.gales, R.drawable.irlanda, R.drawable.francia, R.drawable.italia};
    private ArrayList<Jugador> listaJugadores;
    private Adaptador adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lvListaJugadores = (ListView) findViewById(R.id.lvListaJugadores);
        btnNuevoJugador = (Button) findViewById(R.id.btnNuevoJugador);
        listaJugadores = new ArrayList<>();

        btnNuevoJugador.setOnClickListener(this);

        adaptador = new Adaptador(getApplicationContext(), listaJugadores);

        lvListaJugadores.setAdapter(adaptador);
        registerForContextMenu(lvListaJugadores);//Menu eliminar item
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btnNuevoJugador.getId()) {
            LayoutInflater layoutInflater = LayoutInflater.from(this);
            dialogView = layoutInflater.inflate(R.layout.dialog_nuevo_jugador, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setView(dialogView);
            builder.setTitle("Agregar Jugador");
            AlertDialog alertDialog = builder.create();

            btnCancelar = (Button) dialogView.findViewById(R.id.btnCancelar);
            btnGuardar = (Button) dialogView.findViewById(R.id.btnGuardar);
            etNombreJugador = (EditText) dialogView.findViewById(R.id.etNombreJugador);
            etValoracion = (EditText) dialogView.findViewById(R.id.etValoracion);
            spNacionalidad = (Spinner) dialogView.findViewById(R.id.spNacionalidad);
            imgBandera = (ImageView) dialogView.findViewById(R.id.imgBandera);

            ArrayAdapter<String> arrayAdapter =new ArrayAdapter<>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, nacionalidad);
            spNacionalidad.setAdapter(arrayAdapter);
            spNacionalidad.setSelection(arrayAdapter.NO_SELECTION, false);

            spNacionalidad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position > 0){
                        imgBandera.setImageResource(banderas[position]);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });

            btnGuardar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nombre = etNombreJugador.getText().toString();
                    String valoracion = etValoracion.getText().toString();

                    if (nombre.isEmpty() || valoracion.isEmpty() || spNacionalidad.getSelectedItemPosition() == 0){
                        String mensaje = "No se permiten campos vacios";
                        Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
                    } else {
                        String nacionalidad = spNacionalidad.getSelectedItem().toString();
                        int foto = banderas[spNacionalidad.getSelectedItemPosition()];

                        Jugador jugador = new Jugador(nombre, valoracion, nacionalidad, foto);

                        listaJugadores.add(jugador);

                        adaptador.notifyDataSetChanged();

                        alertDialog.dismiss();
                    }
                }
            });

            btnCancelar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertDialog.dismiss();
                }
            });

            alertDialog.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = MainActivity.this.getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);
        return true;
        //return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_ordenar_puntuacion){
            listaJugadores.sort(Collections.reverseOrder());

            adaptador.notifyDataSetChanged();
        }
        return true;
        //return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //Inflar menu contextual del xml
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_contextual, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int position = info.position;
        Jugador seleccionado = listaJugadores.get(position);

        if (item.getItemId() == R.id.menu_eliminar_item){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Eliminar Registro");
            builder.setMessage("¿Desea borrar el item?");

            //Boton si
            builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    listaJugadores.remove(position);
                    adaptador.notifyDataSetChanged();
                }
            });

            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        } else if (item.getItemId() == R.id.menu_actualizar_item){
            //Construir el dialog partiendo del otro
            LayoutInflater layoutInflater = LayoutInflater.from(this);
            View dialogViewActualizar = layoutInflater.inflate(R.layout.dialog_nuevo_jugador, null);

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setView(dialogViewActualizar);
            builder.setTitle("Actualizar Jugador");
            AlertDialog alertDialog = builder.create();

            //Elementos del dialog_nuevo_jugador.xml
            etNombreJugador = dialogViewActualizar.findViewById(R.id.etNombreJugador);
            etValoracion = dialogViewActualizar.findViewById(R.id.etValoracion);
            spNacionalidad = dialogViewActualizar.findViewById(R.id.spNacionalidad);
            btnGuardar = dialogViewActualizar.findViewById(R.id.btnGuardar);
            btnCancelar = dialogViewActualizar.findViewById(R.id.btnCancelar);
            imgBandera = dialogViewActualizar.findViewById(R.id.imgBandera);

            //Configurar el Spinner de nacionalidades igual que en el alta
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, nacionalidad);
            spNacionalidad.setAdapter(arrayAdapter);

            spNacionalidad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (position > 0) {
                        imgBandera.setImageResource(banderas[position]);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            //Rellenar los campos del jugador seleccionado
            etNombreJugador.setText(seleccionado.getNombre());
            etValoracion.setText(seleccionado.getValoracion());

            //Buscar la nacionalidad
            for(int i = 0; i < nacionalidad.length; i++){
                if (nacionalidad[i].equals(seleccionado.getNacionalidad())){
                    spNacionalidad.setSelection(i);
                    break;
                }
            }

            btnGuardar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nombreNuevo = etNombreJugador.getText().toString();
                    String valoracionNueva = etValoracion.getText().toString();

                    if (nombreNuevo.isEmpty() || valoracionNueva.isEmpty() || spNacionalidad.getSelectedItemPosition() == 0){
                        Toast.makeText(getApplicationContext(), "No se permiten campos vacios", Toast.LENGTH_LONG).show();
                    } else {
                        String nacionalidadNueva = spNacionalidad.getSelectedItem().toString();
                        int foto = banderas[spNacionalidad.getSelectedItemPosition()];

                        //Actualizar los datos del jugador seleccionado
                        seleccionado.setNombre(nombreNuevo);
                        seleccionado.setValoracion(valoracionNueva);
                        seleccionado.setNacionalidad(nacionalidadNueva);
                        seleccionado.setFoto(foto);

                        //Refrescar el adaptador para reflejar cambios en la lista
                        adaptador.notifyDataSetChanged();
                        alertDialog.dismiss();
                    }
                }
            });

            btnCancelar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alertDialog.dismiss();
                }
            });

            alertDialog.show();
        }

        return true;
        //return super.onContextItemSelected(item);
    }
}