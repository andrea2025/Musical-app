package com.example.musicalapp;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private ArrayList<SongList> listdata;

    public SongAdapter(ArrayList<SongList> listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.custom_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.ViewHolder holder, int position) {
        SongList myListData = listdata.get(position);
        holder.songName.setText(myListData.getSongName());
        holder.authorName.setText(myListData.getAlbumName());
        holder.imageView.setImageResource(myListData.getImage());
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

   class ViewHolder extends RecyclerView.ViewHolder {
        TextView songName;
        TextView authorName;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songName = itemView.findViewById(R.id.songName);
            authorName = itemView.findViewById(R.id.authorName);
            imageView = itemView.findViewById(R.id.imageIcon);

        }
    }

}
