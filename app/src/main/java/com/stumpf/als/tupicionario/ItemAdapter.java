package com.stumpf.als.tupicionario;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    private int backgroundColor;
    public ItemAdapter(Context context, ArrayList<Item> list, int backgroundColor){
        super(context, 0, list);
        this.backgroundColor = backgroundColor;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null){
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Item item = getItem(position);
        TextView titulo = itemView.findViewById(R.id.titulo_item);
        titulo.setText(item.getTitulo());
        TextView descricao = itemView.findViewById(R.id.descricao_item);
        descricao.setText(item.getDescricao());
        ImageView icon = itemView.findViewById(R.id.imagem_item);
        icon.setImageResource(item.getImagem());
        LinearLayout layout = itemView.findViewById(R.id.layout_item);
        int cor = ContextCompat.getColor(getContext(), backgroundColor);
        layout.setBackgroundColor(cor);
        return itemView;
    }
}
