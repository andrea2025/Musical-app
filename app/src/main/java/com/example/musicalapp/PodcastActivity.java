package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);

        ArrayList<SongList> songList = new ArrayList<SongList>();
        songList.add(new SongList(R.drawable.ic_podcast, "Hunting Ghislaine", "Led Zeppelin"));
        songList.add(new SongList(R.drawable.ic_podcast, "United Zingdom", "BBc"));
        songList.add(new SongList(R.drawable.ic_podcast, "The Isolation Tapes", "Bbc sound"));
        songList.add(new SongList(R.drawable.ic_podcast, "The Nobody Zone", "Nils Lofgren"));
        songList.add(new SongList(R.drawable.ic_podcast, "The Heart", "Blockheads"));
        songList.add(new SongList(R.drawable.ic_podcast, "Rabbit Hole", "Brad Paisley"));
        songList.add(new SongList(R.drawable.ic_podcast, "The Adam Buxton Podcast", "Michael Jackson"));
        songList.add(new SongList(R.drawable.ic_podcast, "The Daily", "Bob Dylan Dream"));
        songList.add(new SongList(R.drawable.ic_podcast, "The Alan Partridge podcast", "From the Oasthouse"));
        songList.add(new SongList(R.drawable.ic_podcast, "Telling Everybody Everything", "Katherine Ryan"));
        songList.add(new SongList(R.drawable.ic_podcast, "Wind of Change", "CIA"));
        songList.add(new SongList(R.drawable.ic_podcast, "Dear Joan and Jericha", "Nils Lofgren"));
        songList.add(new SongList(R.drawable.ic_podcast, "Grounded With Louis Theroux", "Ian Dury and the Blockheads"));
        songList.add(new SongList(R.drawable.ic_podcast, "Old Alabama", "Brad Paisley"));
        songList.add(new SongList(R.drawable.ic_podcast, "Nice White Parents", "Cher"));
        songList.add(new SongList(R.drawable.ic_podcast, "Wind of Change", "Grand Casino"));
        SongAdapter songAdapter = new SongAdapter(this, songList);
        ListView listView = findViewById(R.id.podcastList);
        listView.setAdapter(songAdapter);
    }
}