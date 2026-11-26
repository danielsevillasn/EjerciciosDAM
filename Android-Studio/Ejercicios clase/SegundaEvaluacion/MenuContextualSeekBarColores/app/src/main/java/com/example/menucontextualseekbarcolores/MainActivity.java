package com.example.menucontextualseekbarcolores;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.menucontextualseekbarcolores.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {

    private ActivityMainBinding binding;
    private TextView tvRojo, tvVerde, tvAzul;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        registerForContextMenu(binding.tvClick);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        //super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Eliga color de fondo:");
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_contextual_colores, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.itemRojo){
            binding.tvClick.setBackgroundColor(Color.RED);
        }
        if (item.getItemId() == R.id.itemVerde){
            binding.tvClick.setBackgroundColor(Color.GREEN);
        }
        if (item.getItemId() == R.id.itemAzul){
            binding.tvClick.setBackgroundColor(Color.BLUE);
        }
        if (item.getItemId() == R.id.itemPersonalizado){
            cargarCuadroDialogoColores();
        }

        return super.onContextItemSelected(item);
    }

    private void cargarCuadroDialogoColores() {
        View configuradorColores = View.inflate(this, R.layout.configurador_colores, null);

        dialog = new Dialog(this);
        dialog.setContentView(configuradorColores);
        dialog.show();

        tvRojo = configuradorColores.findViewById(R.id.tvRojo);
        tvVerde = configuradorColores.findViewById(R.id.tvVerde);
        tvAzul = configuradorColores.findViewById(R.id.tvAzul);

        SeekBar sbRojo = configuradorColores.findViewById(R.id.sbRojo);
        SeekBar sbVerde = configuradorColores.findViewById(R.id.sbVerde);
        SeekBar sbAzul = configuradorColores.findViewById(R.id.sbAzul);

        sbRojo.setOnSeekBarChangeListener(this);
        sbVerde.setOnSeekBarChangeListener(this);
        sbAzul.setOnSeekBarChangeListener(this);

        Button btnConfirmar = dialog.findViewById(R.id.btnConfirmar);
        Button btnCancelar = dialog.findViewById(R.id.btnCancelar);

        if (btnCancelar != null) {
            btnCancelar.setOnClickListener(this);
        }
        if (btnConfirmar != null) {
            btnConfirmar.setOnClickListener(this);
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (seekBar.getId() == R.id.sbRojo){
            if (tvRojo != null) {
                tvRojo.setText(String.valueOf(progress));
            }
        }
        if (seekBar.getId() == R.id.sbVerde){
            if (tvVerde != null) {
                tvVerde.setText(String.valueOf(progress));
            }
        }
        if (seekBar.getId() == R.id.sbAzul){
            if (tvAzul != null) {
                tvAzul.setText(String.valueOf(progress));
            }
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnCancelar){
            Toast.makeText(this, "No se cambiará de color", Toast.LENGTH_LONG).show();
            if (dialog != null) {
                dialog.dismiss();
            }
        }

        if (v.getId() == R.id.btnConfirmar){
            int rojo = Integer.parseInt(tvRojo.getText().toString());
            int verde = Integer.parseInt(tvVerde.getText().toString());
            int azul = Integer.parseInt(tvAzul.getText().toString());

            binding.tvClick.setBackgroundColor(Color.rgb(rojo, verde, azul));
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }
}
