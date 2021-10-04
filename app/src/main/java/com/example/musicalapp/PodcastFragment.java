package com.example.musicalapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PodcastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class PodcastFragment extends Fragment {

    // TODO: Rename and change types of parameters

    public PodcastFragment() {
        // Required empty public constructor
    }

    public static PodcastFragment newInstance() {
        PodcastFragment fragment = new PodcastFragment();
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
        View  itemView = inflater.inflate(R.layout.fragment_podcast, container, false);
        ArrayList<SongList> songList = new ArrayList<SongList>();
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.hunting), getString(R.string.led)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.united), getString(R.string.bbc)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.tapes), getString(R.string.bbc_sound)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.zone), getString(R.string.nils)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.heart), getString(R.string.blockhead)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.hole), getString(R.string.brad)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.buxton), getString(R.string.jackson)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.the_daily), getString(R.string.dylan_dream)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.partidge), getString(R.string.oasthouse)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.telling_everybody), getString(R.string.ryan)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.wind_change), getString(R.string.cia)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.joan_jericha), getString(R.string.lofgren)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.louis_theroux), getString(R.string.dury_blockhead)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.old_Alabama), getString(R.string.brad_paisley)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.nice_white), getString(R.string.cher)));
        songList.add(new SongList(R.drawable.ic_podcast, getString(R.string.wind_change), getString(R.string.grand_caisno)));
        SongAdapter songAdapter = new SongAdapter(songList);
        RecyclerView listView = itemView.findViewById(R.id.podcastList);

        listView.setAdapter(songAdapter);
        return itemView;
    }
}