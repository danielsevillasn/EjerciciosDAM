package com.example.listviewadaptadorpersonalizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Implementa la logica de los items en el list view
 */
public class Adaptador extends BaseAdapter {

    private Context miContexto;
    private ArrayList<ModeloPersona> miArrayList;

    public Adaptador(Context miContexto, ArrayList<ModeloPersona> miArrayList) {
        this.miContexto = miContexto;
        this.miArrayList = miArrayList;
    }

    @Override
    public int getCount() {
        return miArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return miArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater constructorLayout = LayoutInflater.from(miContexto);
            convertView = constructorLayout.inflate(R.layout.item, parent, false);
        }

        //Instanciamiento de elementos
        TextView tvNombre = convertView.findViewById(R.id.tvNombre);
        TextView tvDescripcion = convertView.findViewById(R.id.tvDescripvion);
        ImageView imgFoto = convertView.findViewById(R.id.imgFoto);

        tvNombre.setText(miArrayList.get(position).getNombre());
        tvDescripcion.setText(miArrayList.get(position).getDescripcion());
        imgFoto.setImageResource(miArrayList.get(position).getFoto());

        return convertView;
    }
}
