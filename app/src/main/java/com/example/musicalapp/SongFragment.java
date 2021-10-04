package com.example.musicalapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SongFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SongFragment extends Fragment {


    public SongFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static SongFragment newInstance() {
        SongFragment fragment = new SongFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_song, container, false);
        ArrayList<SongList> songList = new ArrayList<SongList>();
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.hats_off), getString(R.string.led_zep)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.song_bob), getString(R.string.david_bowie)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.jackie_wilson), getString(R.string.van)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.keith_go), getString(R.string.nils)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.sweet_gene), getString(R.string.dury_blockhead)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.old_Alabama), getString(R.string.brad_paisley)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.das_racist), getString(R.string.jackson)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.against), getString(R.string.dylan_dream)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.dolly), getString(R.string.ashley)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.believe), getString(R.string.cher)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.jackie_wilson), getString(R.string.van)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.keith_go), getString(R.string.nils)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.sweet_gene), getString(R.string.dury_blockhead)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.old_Alabama), getString(R.string.brad_paisley)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.believe), getString(R.string.cher)));
        songList.add(new SongList(R.drawable.ic_headphones, getString(R.string.believe), getString(R.string.cher)));
        SongAdapter songAdapter = new SongAdapter(songList);
        RecyclerView listView = view.findViewById(R.id.songListView);
        listView.setAdapter(songAdapter);
        return view;
    }
}