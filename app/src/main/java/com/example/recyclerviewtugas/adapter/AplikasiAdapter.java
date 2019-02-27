package com.example.recyclerviewtugas.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewtugas.R;
import com.example.recyclerviewtugas.models.Aplikasi;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AplikasiAdapter extends RecyclerView.Adapter<AplikasiAdapter.ViewHolder> {

    private List<Aplikasi> AplikasiList;

    public AplikasiAdapter(List<Aplikasi> AplikasiList) {

        this.AplikasiList = AplikasiList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View filmView = inflater.inflate(R.layout.item_aplikasi, viewGroup, false);

        return new ViewHolder(filmView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Aplikasi Aplikasi = AplikasiList.get(i);

        if (Aplikasi.getImg() != null) {
            Picasso.get().load(Aplikasi.getImg()).into(viewHolder.imageView);
        } else {
            Picasso.get().load(Aplikasi.getImg_local()).into(viewHolder.imageView);
        }

        viewHolder.textView.setText(Aplikasi.getTitle());
    }

    @Override
    public int getItemCount() {
        return AplikasiList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        TextView descView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.item_aplikasi_img);
            textView = itemView.findViewById(R.id.item_aplikasi_title);
            descView = itemView.findViewById(R.id.item_aplikasi_desc);
        }
    }
}
