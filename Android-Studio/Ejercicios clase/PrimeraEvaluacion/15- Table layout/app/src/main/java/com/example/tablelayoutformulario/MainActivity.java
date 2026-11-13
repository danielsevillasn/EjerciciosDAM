package com.example.tablelayoutformulario;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etCodigo;
    private Button btnLimpiar;
    private Button btnGuardar;
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
        etCodigo = findViewById(R.id.etCodigo);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etCodigo.setText("");
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String codigo = etCodigo.getText().toString().trim();

                if(codigo.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Por favor completa el campo vacio",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "El codigo:"+codigo+" ha sido guardado",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}