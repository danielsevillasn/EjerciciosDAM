package com.example.a10datepickervsdatepickerdialog;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DatePicker dpFecha;
    private TextView tvFecha;
    private Button btnFecha;
    private int dia, mes, año;

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

        btnFecha=(Button) findViewById(R.id.btnFecha);
        dpFecha=(DatePicker) findViewById(R.id.dpFecha);
        tvFecha=(TextView) findViewById((R.id.tvFecha));
        btnFecha.setOnClickListener(this);

        dpFecha.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                tvFecha.setText(dayOfMonth+"/"+(1+monthOfYear)+"/"+year);
            }
        });
    }

    @Override
    public void onClick(View v) {
        final Calendar calendar = Calendar.getInstance();
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        mes = calendar.get(Calendar.MONTH);
        año = calendar.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tvFecha.setText(dayOfMonth+"/"+(1+month)+"/"+year);
            }
        }, año, mes, dia);
        datePickerDialog.show();
    }
}