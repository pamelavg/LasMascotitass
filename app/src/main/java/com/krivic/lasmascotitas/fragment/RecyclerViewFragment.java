package com.krivic.lasmascotitas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.krivic.lasmascotitas.R;
import com.krivic.lasmascotitas.adapter.MascotaAdapter;
import com.krivic.lasmascotitas.pojo.Mascota;

import java.util.ArrayList;



public class RecyclerViewFragment extends Fragment{

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inizializarAdapter();
        return v;
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("MascotaA","5","",R.drawable.perro));
        mascotas.add(new Mascota("MascotaB","5","",R.drawable.gato));
        mascotas.add(new Mascota("MascotaC","3","",R.drawable.pollito));
        mascotas.add(new Mascota("MascotaD","2","",R.drawable.conejo));
        mascotas.add(new Mascota("MascotaE","2","",R.drawable.perro2));
    }

    public void inizializarAdapter(){
        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(adapter);
    }
}

