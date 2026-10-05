package com.example.hamburguesa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnTernera;
    private Button btnPollo;
    private Button btnPescado;
    private CheckBox chBoxQueso;
    private CheckBox chBoxBacon;
    private CheckBox chBoxHuevo;
    private CheckBox chBoxPepinillo;
    private TextView txtViewPrecio;
    private ImageView imgViewBase;
    private double precioCheckBox = 0;
    private double precioButton = 0;
    private  boolean clickBotonTernera = false;
    private  boolean clickBotonPescado = false;
    private  boolean clickBotonPollo = false;


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

        txtViewPrecio = findViewById(R.id.txtVPrecio);
        btnTernera = findViewById(R.id.btnTernera);
        btnPollo = findViewById(R.id.btnPollo);
        btnPescado = findViewById(R.id.btnPescado);
        chBoxQueso = findViewById(R.id.chBoxQueso);
        chBoxBacon = findViewById(R.id.chBoxBacon);
        chBoxHuevo = findViewById(R.id.chBoxHuevo);
        chBoxPepinillo = findViewById(R.id.chBoxPepinillo);
        imgViewBase = findViewById(R.id.ivImagen);

        btnTernera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickBotonTernera = true;
                clickBotonPescado = false;
                clickBotonPollo = false;
                imgViewBase.setImageResource(R.drawable.solo_carne);
                calculoPrecioBotones(view);
            }
        });
        btnPescado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickBotonPescado = true;
                clickBotonTernera = false;
                clickBotonPollo = false;
                calculoPrecioBotones(view);
                imgViewBase.setImageResource(R.drawable.solo_pescado);
            }
        });
        btnPollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickBotonPollo = true;
                clickBotonPescado = false;
                clickBotonTernera = false;
                calculoPrecioBotones(view);
                imgViewBase.setImageResource(R.drawable.solo_pollo);
            }
        });
    }

    public void calculoPrecioCheckBox(View v){
        precioCheckBox = 0;
        if (chBoxQueso.isChecked()){
            precioCheckBox += 0.5;
        }
        if (chBoxBacon.isChecked()){
            precioCheckBox += 1;
        }
        if (chBoxPepinillo.isChecked()){
            precioCheckBox += 0.25;
        }
        if (chBoxHuevo.isChecked()){
            precioCheckBox += 1;
        }
        txtViewPrecio.setText("Precio: "+ (precioCheckBox+precioButton)+"€");
    }

    public void calculoPrecioBotones(View v){
        precioButton = 0;
        if (clickBotonTernera){
            precioButton += 2.5;
        }else if(clickBotonPollo){
            precioButton += 2;
        }else if(clickBotonPescado){
            precioButton += 2.25;
        }else{
            precioButton = 0;
        }
        txtViewPrecio.setText("Precio: "+ (precioCheckBox+precioButton)+"€");
    }
}