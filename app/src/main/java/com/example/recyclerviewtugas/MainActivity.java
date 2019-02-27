package com.example.recyclerviewtugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtugas.adapter.AplikasiAdapter;
import com.example.recyclerviewtugas.models.Aplikasi;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Aplikasi> aplikasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Aplikasi> aplikasiList = new ArrayList<>();
        aplikasiList.add(new Aplikasi("aplikasi_1", "WhatsApp","",R.drawable.wa));
        aplikasiList.add(new Aplikasi("aplikasi_2", "Instagram","", R.drawable.Instagram));
        aplikasiList.add(new Aplikasi("aplikasi_3", "Line","", R.drawable.line));
        aplikasiList.add(new Aplikasi("aplikasi_4", "Webtoon","" ,R.drawable.webtoon));

        AplikasiAdapter adapterAplikasi = new AplikasiAdapter(aplikasiList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvAplikasi);
        recyclerView.setAdapter(adapterAplikasi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }}

