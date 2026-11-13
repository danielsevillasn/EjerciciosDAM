package com.example.listviewnumerosromanoshashmap;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.listviewnumerosromanoshashmap.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemLongClickListener {
    private ActivityMainBinding binding;
    private String[] numerosCardinales = {"uno","dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte", "cincuenta", "cien"}; //Otra alternativa para construir la lista
    private String[] numerosRomanos = {"I", "II", "III", "IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII", "XIX", "XX", "L", "C"};

    private SimpleAdapter simpleAdapter;
    private List<Map<String,String>> listaMapaDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listaMapaDatos = new ArrayList<>();
        for(int i = 0;i < numerosCardinales.length;i++){
            Map<String,String> mapaDatosNumeros = new HashMap<>();
            mapaDatosNumeros.put("numeroCardinalKey",numerosCardinales[i]);
            mapaDatosNumeros.put("numeroRomanoKey",numerosRomanos[i]);
            listaMapaDatos.add(mapaDatosNumeros);
        }

        //Definimos claves de origen (FROM) y los IDs de destino del XML (TO)
        String[] from = {"numeroCardinalKey","numeroRomanoKey"};
        int[] to = {R.id.tvNumeroCardinal,R.id.tvNumeroRomano};
        simpleAdapter = new SimpleAdapter(getApplicationContext(),listaMapaDatos,R.layout.item_layout_propio,from,to);
        binding.lvNumeros.setAdapter(simpleAdapter);

        binding.lvNumeros.setOnItemClickListener(this);
        binding.btnInsertar.setOnClickListener(this);
        binding.lvNumeros.setOnItemLongClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        binding.tvNumeroRomano.setText(listaMapaDatos.get(position).get("numeroRomanoKey"));

    }

    @Override
    public void onClick(View v) {
        if(binding.etNumeroInsertarCardinal.getText().toString().equals("") || binding.etNumeroInsertarRomano.getText().toString().equals("")){
            //Completar con alert dialog
            Toast.makeText(getApplicationContext(),"Debe rellenar ambos campos de texto",Toast.LENGTH_LONG).show();
        }else{
            //Añade un nuevo numero romano
            Map<String,String> mapaDatosNumeros = new HashMap<>();
            mapaDatosNumeros.put("numeroCardinalKey",binding.etNumeroInsertarCardinal.getText().toString());
            mapaDatosNumeros.put("numeroRomanoKey",binding.etNumeroInsertarRomano.getText().toString());
            listaMapaDatos.add(mapaDatosNumeros);

            simpleAdapter.notifyDataSetChanged(); //Actualizacion del adapter

            //Vaciar ambos edit text
            binding.etNumeroInsertarRomano.setText("");
            binding.etNumeroInsertarCardinal.setText("");
        }

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

        //Pide la confirmación del usuario
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        //Se emplea el main activity en vez del get application context por que necesita estar asignado a la actividad en concreto y no a la applicacion en general
        builder.setTitle("Eliminacion de dato");
        builder.setMessage("¿Desea borrar el item"+position+"?");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Elimina un elemento del mapa y lo actualiza en el listview
                listaMapaDatos.remove(position);
                simpleAdapter.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Lista intacta",Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        return true; //Si lo pones en true no permites que mas eventos asignados al elemento se lanzen
    }
}