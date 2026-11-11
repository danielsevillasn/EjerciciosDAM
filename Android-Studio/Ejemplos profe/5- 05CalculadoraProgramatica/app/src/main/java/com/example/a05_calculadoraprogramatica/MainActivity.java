package com.example.a05_calculadoraprogramatica;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private EditText etOperando1;
    private EditText etOperando2;
    private TextView tvResultado;
    private RadioButton rbSumar;
    private RadioButton rbRestar;
    private RadioButton rbMultiplicar;
    private RadioButton rbDividir;

    private Double operando1, operando2, resultado;

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
        rbSumar=findViewById(R.id.rbSumar);
        rbRestar=findViewById(R.id.rbRestar);
        rbMultiplicar=findViewById(R.id.rbMultiplicar);
        rbDividir=findViewById(R.id.rbDividir);

        rbSumar.setOnCheckedChangeListener(this);
        rbRestar.setOnCheckedChangeListener(this);
        rbMultiplicar.setOnCheckedChangeListener(this);
        rbDividir.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
        try {
            operando1 = Double.parseDouble(etOperando1.getText().toString());
            operando2 = Double.parseDouble(etOperando2.getText().toString());

            if (rbSumar.isChecked())
                resultado = operando1 + operando2;
            if (rbRestar.isChecked())
                resultado = operando1 - operando2;
            if (rbMultiplicar.isChecked())
                resultado = operando1 * operando2;
            if (rbDividir.isChecked()) {
                resultado = operando1 / operando2;
                if (operando2 == 0)
                    Toast.makeText(getApplicationContext(), "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
            }
            tvResultado.setText(resultado.toString());
        } catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(), "Falta operando", Toast.LENGTH_SHORT).show();
            Log.e("ERROR", e.toString());
        }

    }
}