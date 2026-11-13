package com.example.modeloexamensixnations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context miContexto;
    private ArrayList<Jugador> miArrayList;

    public Adaptador(Context miContexto, ArrayList<Jugador> miArrayList) {
        this.miContexto = miContexto;
        this.miArrayList = miArrayList;
    }


    @Override
    public int getCount() {
        //return 0;
        return miArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        //return null;
        return miArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(miContexto);
        convertView = layoutInflater.inflate(R.layout.item, null);

        TextView tvNombreJugador = convertView.findViewById(R.id.tvNombreJugador);
        TextView tvNacionalidadJugador = convertView.findViewById(R.id.tvNacionalidadJugador);
        TextView tvValoracionJugador = convertView.findViewById(R.id.tvValoracionJugador);
        ImageView imgBandera = convertView.findViewById(R.id.ivFotoJugador);

        tvNombreJugador.setText(miArrayList.get(position).getNombre());
        tvNacionalidadJugador.setText(miArrayList.get(position).getNacionalidad());
        tvValoracionJugador.setText(miArrayList.get(position).getValoracion());
        imgBandera.setImageResource(miArrayList.get(position).getFoto());

        return convertView;
        //return null;
    }
}
