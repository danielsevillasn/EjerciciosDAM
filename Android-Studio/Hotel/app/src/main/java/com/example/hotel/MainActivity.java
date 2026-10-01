package com.example.hotel;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private CheckBox chBox1;
    private CheckBox chBox2;
    private CheckBox chBox3;
    private TextView txtVPrecio;
    private ImageView ivImagen;
    private double precio = 0;

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
        chBox1 = findViewById(R.id.chBox1);
        chBox2 = findViewById(R.id.chBox2);
        chBox3 = findViewById(R.id.chBox3);
        txtVPrecio = findViewById(R.id.txtVPrecio);
        ivImagen = findViewById(R.id.ivImagen);

        chBox1.setOnCheckedChangeListener(this);
        chBox2.setOnCheckedChangeListener(this);
        chBox3.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
        precio = 0;
        if(chBox1.isChecked()){
            precio += 10;
            ivImagen.setImageResource(R.drawable.desayuno);
        }
        if(chBox2.isChecked()){
            precio += 25;
            ivImagen.setImageResource(R.drawable.comida);
        }

        if(chBox3.isChecked()){
            precio +=30;
            ivImagen.setImageResource(R.drawable.cena);
        }


        txtVPrecio.setText("Precio: "+precio+"€");
    }

}