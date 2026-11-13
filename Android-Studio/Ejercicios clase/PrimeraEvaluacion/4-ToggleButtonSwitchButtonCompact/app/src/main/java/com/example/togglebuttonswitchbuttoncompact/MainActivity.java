package com.example.togglebuttonswitchbuttoncompact;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    private ToggleButton tb;
    private Switch sw;
    private SwitchCompat swc;
    private TextView tv1, tv2, tv3;

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

        tb = findViewById(R.id.tb);
        sw = findViewById(R.id.sw);
        swc = findViewById(R.id.swc);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        tb.setOnCheckedChangeListener(this);
        sw.setOnCheckedChangeListener(this);
        swc.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
        if(buttonView.getId() == tb.getId()){
            if(isChecked){
                tv1.setText(getResources().getString(R.string.seleccionado));
                tv1.setTextColor(getResources().getColor(R.color.mirojo));
            }else{
                tv1.setText(getResources().getString(R.string.no_seleccionado));
                tv1.setTextColor(getResources().getColor(R.color.gris));
            }
        }
        if(buttonView.getId() == sw.getId()){
            if(isChecked){
                tv2.setText(getResources().getString(R.string.seleccionado));
                tv2.setTextColor(getResources().getColor(R.color.miazul));
            }else{
                tv2.setText(getResources().getString(R.string.no_seleccionado));
                tv2.setTextColor(getResources().getColor(R.color.gris));
            }
        }
        if(buttonView.getId() == swc.getId()){
            if(isChecked){
                tv3.setText(getResources().getString(R.string.seleccionado));
                tv3.setTextColor(getResources().getColor(R.color.miverde));
            }else{
                tv3.setText(getResources().getString(R.string.no_seleccionado));
                tv3.setTextColor(getResources().getColor(R.color.gris));
            }
        }
    }
}