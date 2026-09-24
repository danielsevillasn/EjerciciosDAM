package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etOperando1;
    private EditText etOperando2;
    private TextView tvResultado;
    private Double operando1,operando2,resultado;

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

        etOperando1=findViewById(R.id.etOperando1);
        etOperando2=findViewById(R.id.etOperando2);
        tvResultado=findViewById(R.id.tvResultado);
        //btnSumar=findViewById(R.id.btnSumar);
        //btnRestar=findViewById(R.id.btnRestar);
        //btnMultiplicar=findViewById(R.id.btnMultiplicar);
        //btnDividir=findViewById(R.id.btnDividir);
    }

    public void operacion(View view) {
        try {
            operando1 = Double.parseDouble(etOperando1.getText().toString());
            operando2 = Double.parseDouble(etOperando2.getText().toString());

            String operador = ((RadioButton) view).getText().toString();
            switch (operador) {
                case "Sumar" -> resultado = operando1 + operando2;
                case "Resta" -> resultado = operando1 - operando2;
                case "Multiplicar" -> resultado = operando1 * operando2;
                case "Dividir" -> {
                    if (operando2 == 0) {
                        Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
                        return;
                    }
                    resultado = operando1 / operando2;
                    if (resultado.isInfinite() || resultado.isNaN()) {
                        Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
                        return;
                    }
                }
                default -> resultado = 0.0;
            }

            tvResultado.setText(resultado.toString());

        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "No se puede ingresar palabras o dejar campos vacíos", Toast.LENGTH_LONG).show();
        }
    }
}