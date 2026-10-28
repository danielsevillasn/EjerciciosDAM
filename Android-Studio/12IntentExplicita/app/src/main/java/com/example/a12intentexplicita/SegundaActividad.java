package com.example.a12intentexplicita;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActividad extends AppCompatActivity implements View.OnClickListener {

    private TextView tvSaludo;
    private Button btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda_actividad);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tvSaludo = findViewById(R.id.tvSaludo);
        btnSalir = findViewById(R.id.btnSalir);

        btnSalir.setOnClickListener(this);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            tvSaludo.setText(bundle.getString("nombreUsuario"));
        }

        /**
         * Otra manera de sacar el extra
         *  String nombreUsuario = getIntent().getStringExtra("nombreUsuario");
         *  if (nombreUsuario != null) {
         *      tvSaludo.setText(nombreUsuario);
         *  }
         */

    }

    @Override
    public void onClick(View v) {
        finishAffinity(); //Cierra todas las actividades
        //finish(); Cierra solo la actividad actual
    }
}