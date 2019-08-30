package com.novaturistmo.novaturismo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PontoDetalheActivity extends AppCompatActivity {

    private TextView tv_mais_historia;
    private TextView tv_deixar_comentario;
    private ImageView back_ponto_details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponto_detalhe);

        tv_mais_historia = findViewById(R.id.tv_mais_historia);
        tv_deixar_comentario = findViewById(R.id.tv_deixar_comentario);

        tv_mais_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PontoDetalheActivity.this,MidiaActivity.class));
            }
        });

        tv_deixar_comentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deixarComentario();
            }
        });

        back_ponto_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    public void deixarComentario(){
        AlertDialog.Builder builder = new AlertDialog.Builder(PontoDetalheActivity.this);
        // Get the layout inflater
        LayoutInflater inflater = PontoDetalheActivity.this.getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_comentario, null))
                // Add action buttons
                .setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        builder.create();
        builder.show();
    }
}
