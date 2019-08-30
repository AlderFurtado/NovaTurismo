package com.novaturistmo.novaturismo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.novaturistmo.novaturismo.Models.CategoriaItem;
import com.novaturistmo.novaturismo.PontoDetalheActivity;
import com.novaturistmo.novaturismo.R;

import java.util.List;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder> {

    private Context context;
    private List<CategoriaItem> categoriaItems;

    public CategoriaAdapter(Context context, List<CategoriaItem> categoriaItems) {
        this.context = context;
        this.categoriaItems = categoriaItems;
    }

    @Override
    public CategoriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(context).inflate(R.layout.item_categorias, parent, false);

        return new CategoriaViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(CategoriaViewHolder holder, int position) {

        holder.categoria_item_texto.setText(categoriaItems.get(position).getNome());
        holder.categoria_item_image.setImageResource(categoriaItems.get(position).getIcone());
    }

    @Override
    public int getItemCount() {
        return categoriaItems.size();
    }

    public static class CategoriaViewHolder extends RecyclerView.ViewHolder{

       TextView categoria_item_texto;
       ImageView categoria_item_image;
       public CategoriaViewHolder(View itemView) {
            super(itemView);

            categoria_item_texto = itemView.findViewById(R.id.categoria_item_texto);
            categoria_item_image = itemView.findViewById(R.id.categoria_item_image);

       }
    }
}
