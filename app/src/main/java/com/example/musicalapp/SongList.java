package com.example.musicalapp;

public class SongList {
    private int image;
    private String songName;
    private String albumName;


    public SongList(int image, String songName, String albumName) {
        this.image = image;
        this.songName = songName;
        this.albumName = albumName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
