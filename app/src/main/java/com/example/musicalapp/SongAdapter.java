package com.example.musicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<SongList> {


    public SongAdapter(@NonNull Context context, ArrayList<SongList> lists) {
        super(context, 0, lists);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.custom_layout, parent, false);
        }
        SongList list = getItem(position);
        TextView songName = listView.findViewById(R.id.songName);
        TextView authorName = listView.findViewById(R.id.authorName);
        ImageView imageView = listView.findViewById(R.id.imageIcon);

        songName.setText(list.getSongName());
        authorName.setText(list.getAlbumName());
        imageView.setImageResource(list.getImage());

        return listView;

    }
}
