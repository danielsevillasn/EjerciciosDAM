package com.example.menuemergentelistview;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.menuemergentelistview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String[] personas = {"Juan","Pepe","Mario","Fran","Raul","Pedro","Maria","Manolo","Hugo","Ana","Ramiro","Daniel","Pablo","Marcos","Ivan","Libio","Dumi","Gonzalo","Marcelo","Alvaro","Asia","Sheyla","Paco"};
    private List<String> listaPersonas = new ArrayList<String>();
    private ArrayAdapter<String> adaptador;
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

        Collections.addAll(listaPersonas,personas);
        adaptador = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaPersonas);
        binding.lvDatos.setAdapter(adaptador);

        binding.lvDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
                popupMenu.getMenuInflater().inflate(R.menu.menu_item_emergente,popupMenu.getMenu());
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.menu_eliminar){
                            Toast.makeText(getApplicationContext(),"Has eliminado a la persona:"+listaPersonas.remove(position),Toast.LENGTH_LONG).show();
                            adaptador.notifyDataSetChanged();
                            return true;
                        }

                        if (item.getItemId() == R.id.menu_modificar){
                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setTitle("Modificar elemento");

                            EditText etEntrada = new EditText(MainActivity.this);
                            etEntrada.setHint("Introduzca un nombre");
                            etEntrada.setText(listaPersonas.get(position));
                            etEntrada.setInputType(EditorInfo.TYPE_CLASS_TEXT);
                            builder.setView(etEntrada);

                            builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    String nuevoNombre = etEntrada.getText().toString();
                                    if(!nuevoNombre.isEmpty()){
                                        Toast.makeText(getApplicationContext(),"Has modificado a la persona:"+listaPersonas.set(position,nuevoNombre),Toast.LENGTH_LONG).show();
                                        adaptador.notifyDataSetChanged();
                                    }else{
                                        Toast.makeText(getApplicationContext(),"El nombre esta vacio",Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                            builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(getApplicationContext(),"Cancelaste la modificacion",Toast.LENGTH_LONG).show();
                                }
                            });
                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();

                            builder.setView(etEntrada);
                            adaptador.notifyDataSetChanged();
                            return true;
                        }

                        return false;
                    }
                });

                Toast.makeText(getApplicationContext(),"Posicion "+position,Toast.LENGTH_LONG).show();
            }
        });
    }
}