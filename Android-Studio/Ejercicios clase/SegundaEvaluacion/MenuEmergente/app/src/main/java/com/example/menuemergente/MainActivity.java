package com.example.menuemergente;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
    private ImageView imgvFoto;
    private float rotacionImagen;

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
        imgvFoto = findViewById(R.id.imgvFoto);
        ImageButton imgBtnAjustes = findViewById(R.id.imgBtnAjustes);

        imgBtnAjustes.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, v);
        MenuInflater infladorPop = popupMenu.getMenuInflater();
        infladorPop.inflate(R.menu.menu_emergente, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if (item.getItemId() == R.id.opcion1) {
            imgvFoto.setRotation(90);
            Toast.makeText(getApplicationContext(), "Rotación de 90º", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.opcion2) {
            imgvFoto.setRotation(180);
            Toast.makeText(getApplicationContext(), "Rotación de 180º", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.opcion3) {
            imgvFoto.setRotation(270);
            Toast.makeText(getApplicationContext(), "Rotación de 270º", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.opcion4) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Elección de grados para rotar la imagen");
            builder.setMessage("Indique la cantidad de grados que quieres rotar la imagen:");

            EditText input = new EditText(this);
            input.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);
            builder.setView(input);

            builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String textoInput = input.getText().toString().trim();
                    if (!textoInput.isEmpty()) {
                        try {
                            rotacionImagen = Float.parseFloat(textoInput);
                            imgvFoto.setRotation(rotacionImagen);
                            Toast.makeText(getApplicationContext(), "Rotación de " + rotacionImagen + "º", Toast.LENGTH_LONG).show();
                        } catch (NumberFormatException e) {
                            Toast.makeText(getApplicationContext(), "Por favor, ingrese un número válido", Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(getApplicationContext(), "Debe ingresar un valor", Toast.LENGTH_LONG).show();
                    }
                }
            });

            builder.setNegativeButton("Cancelar", null);

            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            return true;
        } else if (item.getItemId() == R.id.opcion5) {
            imgvFoto.setRotation(0);
            Toast.makeText(getApplicationContext(), "Rotación restablecida", Toast.LENGTH_LONG).show();
            return true;
        }
        return false;
    }
}