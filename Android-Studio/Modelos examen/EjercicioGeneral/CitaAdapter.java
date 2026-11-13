package com.example.sistemadecitas;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class CitaAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Cita> listaCitas;

    public CitaAdapter(Context context, ArrayList<Cita> listaCitas) {
        this.context = context;
        this.listaCitas = listaCitas;
    }

    @Override
    public int getCount() { return listaCitas.size(); }

    @Override
    public Object getItem(int position) { return listaCitas.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_cita, parent, false);
        }
        ImageView ivIcono = convertView.findViewById(R.id.ivIconoEspecie);
        TextView tvNombre = convertView.findViewById(R.id.tvNombreItem);
        TextView tvFechaHora = convertView.findViewById(R.id.tvFechaHoraItem);
        TextView tvTelefono = convertView.findViewById(R.id.tvTelefonoItem);
        TextView tvUrgencia = convertView.findViewById(R.id.tvUrgenciaItem);

        Cita cita = listaCitas.get(position);
        tvNombre.setText(cita.getNombreMascota() + " (" + cita.getEspecie() + ")");
        tvFechaHora.setText(cita.getFecha() + " - " + cita.getHora());
        if (tvTelefono != null) {
            tvTelefono.setText("Tel: " + cita.getTelefono());
        }
        ivIcono.setImageResource(cita.getIconoResId());
        if (cita.isEsUrgencia()) {
            tvUrgencia.setVisibility(View.VISIBLE);
            tvUrgencia.setText("URGENCIA 24H");
            tvUrgencia.setTextColor(Color.RED);
        } else {
            tvUrgencia.setVisibility(View.GONE);
        }
        return convertView;
    }
}