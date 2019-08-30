package com.novaturistmo.novaturismo.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.novaturistmo.novaturismo.Models.Ponto;
import com.novaturistmo.novaturismo.PontoDetalheActivity;
import com.novaturistmo.novaturismo.R;

import java.util.List;

public class PontoAdapter extends RecyclerView.Adapter<PontoAdapter.PontoHolder> {

    private Context context;
    private List<Ponto> pontos;

    public PontoAdapter(Context context, List<Ponto> pontos) {
        this.context = context;
        this.pontos = pontos;
    }

    @Override
    public PontoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(context).inflate(R.layout.item_ponto, parent, false);

        return new PontoHolder(layout);
    }

    @Override
    public void onBindViewHolder(PontoHolder holder, int position) {

        holder.texto_ponto.setText(pontos.get(position).getNome());
        holder.image_ponto.setImageResource(pontos.get(position).getFoto());
        holder.image_ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, PontoDetalheActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return pontos.size();
    }

    public static class PontoHolder extends RecyclerView.ViewHolder{

        ImageView image_ponto;
        TextView texto_ponto;

        public PontoHolder(View itemView) {
            super(itemView);

            image_ponto = itemView.findViewById(R.id.image_ponto);
            texto_ponto = itemView.findViewById(R.id.texto_ponto);
        }
    }
}
