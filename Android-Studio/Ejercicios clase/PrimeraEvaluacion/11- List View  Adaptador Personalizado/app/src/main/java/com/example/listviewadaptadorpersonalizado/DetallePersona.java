package com.example.listviewadaptadorpersonalizado;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.listviewadaptadorpersonalizado.ModeloPersona;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DetallePersona extends AppCompatActivity {
    private TextView tvDetalleNombre, tvDetalleDescripcion, tvDetalleCodigo;
    private ImageView imgDetalleFoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalle_persona);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvDetalleCodigo = findViewById(R.id.tvDetalleCodigo);
        tvDetalleDescripcion = findViewById(R.id.tvDetalleDescripcion);
        tvDetalleNombre = findViewById(R.id.tvDetalleNombre);
        imgDetalleFoto = findViewById(R.id.imgDetalleFoto);

        Bundle bundle = getIntent().getExtras();
        ModeloPersona persona = (ModeloPersona) bundle.getSerializable("personas");

        tvDetalleNombre.setText(persona.getNombre());
        tvDetalleDescripcion.setText(persona.getDescripcion());
        tvDetalleCodigo.setText(String.valueOf(persona.getCodigo()));
        imgDetalleFoto.setImageResource(persona.getFoto());
    }

}