package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        ArrayList<SongList> songList = new ArrayList<SongList>();
        songList.add(new SongList(R.drawable.ic_headphones, "Hats off to (Roy) Harper", "Led Zeppelin"));
        songList.add(new SongList(R.drawable.ic_headphones, "Song for Bob Dylan", "David Bowie"));
        songList.add(new SongList(R.drawable.ic_headphones, "Jackie Wilson Said", "Van Morrison"));
        songList.add(new SongList(R.drawable.ic_headphones, "Keith Don't Go", "Nils Lofgren"));
        songList.add(new SongList(R.drawable.ic_headphones, "Sweet Gene Vincent", "Ian Dury and the Blockheads"));
        songList.add(new SongList(R.drawable.ic_headphones, "Old Alabama", "Brad Paisley"));
        songList.add(new SongList(R.drawable.ic_headphones, "Das Racist", "Michael Jackson"));
        songList.add(new SongList(R.drawable.ic_headphones, "Against Me!", "Bob Dylan Dream"));
        songList.add(new SongList(R.drawable.ic_headphones, "You Ain't Dolly (And You Ain't Porter)", "Ashley Monroe"));
        songList.add(new SongList(R.drawable.ic_headphones, "Believe", "Cher"));
        songList.add(new SongList(R.drawable.ic_headphones, "Jackie Wilson Said", "Van Morrison"));
        songList.add(new SongList(R.drawable.ic_headphones, "Keith Don't Go", "Nils Lofgren"));
        songList.add(new SongList(R.drawable.ic_headphones, "Sweet Gene Vincent", "Ian Dury and the Blockheads"));
        songList.add(new SongList(R.drawable.ic_headphones, "Old Alabama", "Brad Paisley"));
        songList.add(new SongList(R.drawable.ic_headphones, "Believe", "Cher"));
        songList.add(new SongList(R.drawable.ic_headphones, "Believe", "Cher"));
        SongAdapter songAdapter = new SongAdapter(this, songList);
        ListView listView = findViewById(R.id.songListView);
        listView.setAdapter(songAdapter);
    }
}