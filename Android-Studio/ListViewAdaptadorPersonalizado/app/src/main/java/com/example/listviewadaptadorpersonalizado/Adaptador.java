package com.example.listviewadaptadorpersonalizado;

import android.content.Context;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Implementa la logica de los items en el list view
 */
public class Adaptador extends BaseAdapter {

    private Context miContexto;
    private ArrayList<ModeloPersona> miArrayList;

    public Adaptador(ArrayList<ModeloPersona> miArrayList, Context miContexto) {
        this.miArrayList = miArrayList;
        this.miContexto = miContexto;
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
        return null;
    }
}
