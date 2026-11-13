package com.example.modeloexamenastronomia;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity2 extends AppCompatActivity {

    private ListView lvPlanetas;
    private ArrayList<Planeta> listaPlanetas;
    private TextView tvTitulo;
    private String[] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Jupiter", "Saturno", "Urano", "Neptuno"}; //Ordenados por cercania al sol
    private long[] distancias = {57909175, 108208930, 149597870, 227936640, 778412010, 1426725400, 2870972200L, 4498252900L};
    private double[] diametros = {4879, 12103.6, 12756, 6794.4, 142985, 120534, 51114, 49532.72};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        lvPlanetas = (ListView) findViewById(R.id.lvPlanetas);
        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        listaPlanetas = new ArrayList<>();

        for (int i = 0; i < planetas.length; i++) {
            listaPlanetas.add(new Planeta(planetas[i], distancias[i], diametros[i]));
        }
        String titulo = "";
        String calificacion = getIntent().getStringExtra("calificacion");
        boolean esAscendente = getIntent().getBooleanExtra("esAscendente", true);

        //Ordenar segun el criterio
        if (calificacion != null){
            switch (calificacion){
                case "proximidad":
                    titulo = "Planetas por distancia";
                    listaPlanetas.sort(Planeta.compararDistancia);
                    //Otra forma de hacerlo
                    listaPlanetas.sort(Comparator.comparingLong(Planeta::getDistancia));
                    break;
                case "diametro":
                    titulo = "Planetas por tamaño";
                    listaPlanetas.sort(Planeta.compararDiametro);
                    //Otra forma de hacerlo
                    listaPlanetas.sort(Comparator.comparingDouble(Planeta::getDiametro));
                    break;
                case "alfabetico":
                    titulo = "Planetas por orden alfabético";
                    listaPlanetas.sort(Planeta.compararNombre);
                    //Otra forma de hacerlo
                    listaPlanetas.sort(Comparator.comparing(Planeta::getNombre));
                    break;
            }
        }

        /* - Metodo para ordenar en burbuja
        for (int i = 0; i < listaPlanetas.size() - 1; i++) {
            for (int j = 0; j < listaPlanetas.size() - i - 1; j++) {
                if (listaPlanetas.get(j).getDistancia() > listaPlanetas.get(j + 1).getDistancia()) {
                    // Intercambiamos posiciones
                    Planeta aux = listaPlanetas.get(j);
                    listaPlanetas.set(j, listaPlanetas.get(j + 1));
                    listaPlanetas.set(j + 1, aux);
                }
            }
        }*/

        //Si es descendente, invertimos la lista
        if (!esAscendente){
            titulo += " (Descendente)";
            Collections.reverse(listaPlanetas);
        } else {
            titulo += " (Ascendente)";
        }

        //Preparar la lista a mostrar
        ArrayList<String> datosMostrar = new ArrayList<>();
        for (Planeta p : listaPlanetas){
            if (calificacion.equals("proximidad")){
                datosMostrar.add(p.getNombre() + ": " + p.getDistancia() + " km");
            } else if (calificacion.equals("diametro")){
                datosMostrar.add(p.getNombre() + ": " + p.getDiametro() + " km");
            } else if (calificacion.equals("alfabetico")){
                datosMostrar.add(p.getNombre());
            }
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, datosMostrar);
        lvPlanetas.setAdapter(arrayAdapter);
        tvTitulo.setText(titulo);
    }
}