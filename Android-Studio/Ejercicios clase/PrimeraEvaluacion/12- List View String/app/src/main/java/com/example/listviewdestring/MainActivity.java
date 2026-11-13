package com.example.listviewdestring;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private String[] nombres = {"Pedro","Juan","Ana","Rosa","Mario"};
    private String[] sexos = {"M","M","H","H","M"};
    private String[] telefonos = {"111111","2222222","33333333","444444444","5555555"};
    private ListView lvAgenda;

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

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,nombres);
        lvAgenda.setAdapter(adaptador);

        lvAgenda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),id+" "+telefonos[(int)id],Toast.LENGTH_LONG).show();
            }
        });

        lvAgenda.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),id+" "+sexos[(int)id],Toast.LENGTH_LONG).show();
                return true; //Si pones return false el onclick se ejecuta, en este caso no se ejecutara secuencialmente
            }
        });
    }
}