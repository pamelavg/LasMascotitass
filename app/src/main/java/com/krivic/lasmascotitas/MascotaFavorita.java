package com.krivic.lasmascotitas;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.krivic.lasmascotitas.adapter.MascotaAdapter;
import com.krivic.lasmascotitas.pojo.Mascota;

import java.util.ArrayList;

public class MascotaFavorita extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascota_favorita);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        if(getActionBar() != null){
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.like);
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }


        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFavoritas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inizializarAdapter();
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("MascotaA","5","",R.drawable.perro));
        mascotas.add(new Mascota("MascotaB","5","",R.drawable.gato));


    }

    public void inizializarAdapter(){
        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(adapter);
    }

    public void irMascotas(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

