package com.example.musicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);


//        RelativeLayout songLayout = findViewById(R.id.songClick);
//        RelativeLayout podcastLayout = findViewById(R.id.podcastClick);
//
//        songLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LibraryActivity.this, SongActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        podcastLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LibraryActivity.this, PodcastActivity.class);
//                startActivity(intent);
//            }
//        });

    }
}