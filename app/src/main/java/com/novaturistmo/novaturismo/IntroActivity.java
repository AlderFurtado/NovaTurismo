package com.novaturistmo.novaturismo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    private IntroViewPageAdapter introViewPageAdapter;
    private Button btn_pular_intro;
    private TabLayout tab_controller_intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        tab_controller_intro = findViewById(R.id.tab_controller_intro);


        //Carregar listar da intro
        List<ScreenItem> screenItems = new ArrayList<>();
        screenItems.add(new ScreenItem("Pontos turísticos","Tenha todos os locais que você precisa saber na palma da sua mão ",R.drawable.ic_travel));
        screenItems.add(new ScreenItem("Gamificação","Acumule pontos visitando e conhecendo sobre Belém ",R.drawable.ic_rank));
        screenItems.add(new ScreenItem("História da Cidade","Saiba de toda a historia da cidade das mangueiras",R.drawable.ic_scroll));


        //Setup viewPager
        screenPager = findViewById(R.id.screen_intro_pager);
        introViewPageAdapter = new IntroViewPageAdapter(this,screenItems);
        screenPager.setAdapter(introViewPageAdapter);

        btn_pular_intro = findViewById(R.id.btn_pular_intro);


        tab_controller_intro.setupWithViewPager(screenPager);


        btn_pular_intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, MainActivity.class));

            }
        });
    }
}
