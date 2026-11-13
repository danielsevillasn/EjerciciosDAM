package com.example.modeloexamenastronomia;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnProximidad, btnDiametro, btnAlfabetico;
    private boolean esAscendente;

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

        esAscendente = true;
        btnProximidad = (Button) findViewById(R.id.btnProximidad);
        btnDiametro = (Button) findViewById(R.id.btnDiametro);
        btnAlfabetico = (Button) findViewById(R.id.btnAlfabetico);

        btnProximidad.setOnClickListener(this);
        btnDiametro.setOnClickListener(this);
        btnAlfabetico.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("esAscendente", esAscendente);

        if (v.getId() == btnProximidad.getId()){
            intent.putExtra("calificacion", "proximidad");
        } else if (v.getId() == btnDiametro.getId()){
            intent.putExtra("calificacion", "diametro");
        } else if (v.getId() == btnAlfabetico.getId()){
            intent.putExtra("calificacion", "alfabetico");
        }

        startActivity(intent);
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
        if (item.getItemId() == R.id.menu_ascendente){
            esAscendente = true;
            Toast.makeText(this, "Orden ascendente", Toast.LENGTH_LONG).show();
        } else if (item.getItemId() == R.id.menu_descendente){
            esAscendente = false;
            Toast.makeText(this, "Orden descendente", Toast.LENGTH_LONG).show();
        }
        return true;
        //return super.onOptionsItemSelected(item);
    }
}