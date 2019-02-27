package com.example.recyclerviewtugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtugas.models.Aplikasi;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Aplikasi> aplikasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvAplikasi = (RecyclerView) findViewById(R.id.rvaplikasi);

        aplikasi = aplikasi.createAplikasiList(20);
        Aplikasi adapter = new Aplikasi(aplikasi);
        rvAplikasi.setAdapter(adapter);
        rvAplikasi.setLayoutManager(new LinearLayoutManager(this));
    }
}

