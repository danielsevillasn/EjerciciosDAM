package com.example.listviewadaptadorpersonalizado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvAgenda;
    private ArrayList<ModeloPersona> personas;
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
        lvAgenda = findViewById(R.id.lvAgenda);

        personas = new ArrayList<ModeloPersona>();
        personas.add(new ModeloPersona("Chaval serio y dispuesto","Pepe",101001,R.drawable.pepe));

        Adaptador adaptador = new Adaptador(getApplicationContext(), personas);

        lvAgenda.setAdapter(adaptador);
        lvAgenda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), DetallePersona.class);
                intent.putExtra("personas",personas.get(position));
                startActivity(intent);
            }
        });
    }

}