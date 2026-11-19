package com.example.menudeaplicacion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater infladorMenu = this.getMenuInflater();
            infladorMenu.inflate(R.menu.menu_principal, menu);
            return true;
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent = null;

        if (id == R.id.idealista) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.idealista.com"));
        } else if (id == R.id.google) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        } else if (id == R.id.fotocasa) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fotocasa.es/es/"));
        } else if (id == R.id.marca) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marca.com/"));
        } else if (id == R.id.diarioAs) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://as.com/"));
        }
        if (intent != null) {
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}