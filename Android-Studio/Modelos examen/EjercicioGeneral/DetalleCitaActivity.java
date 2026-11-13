package com.example.sistemadecitas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class DetalleCitaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cita);

        ImageView ivFoto = findViewById(R.id.ivDetalleFoto);
        TextView tvNombre = findViewById(R.id.tvDetalleNombre);
        TextView tvEspecie = findViewById(R.id.tvDetalleEspecie);
        TextView tvFechaHora = findViewById(R.id.tvDetalleFechaHora);
        TextView tvUrgencia = findViewById(R.id.tvDetalleUrgencia);
        TextView tvTelefono = findViewById(R.id.tvDetalleTelefono);
        Button btnVolver = findViewById(R.id.btnVolver);
        Button btnSalir = findViewById(R.id.btnSalir);

        Cita cita = (Cita) getIntent().getSerializableExtra("cita");
        if (cita != null) {
            tvNombre.setText(cita.getNombreMascota());
            tvEspecie.setText(cita.getEspecie());
            tvFechaHora.setText(cita.getFecha() + " a las " + cita.getHora());
            tvTelefono.setText("Tel: " + cita.getTelefono());
            ivFoto.setImageResource(cita.getIconoResId());
            tvUrgencia.setText(cita.isEsUrgencia() ? "Consulta de Urgencia 24h" : "Consulta Ordinaria");
        }

        // finish() vs finishAffinity()
        btnVolver.setOnClickListener(v -> finish());
        btnSalir.setOnClickListener(v -> finishAffinity());
    }
}