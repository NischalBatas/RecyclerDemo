package com.example.recyclerdemo;

public class SingerModelClass {
    private int image;
    private String singerName;
    private String genre;

    public SingerModelClass(int image, String singerName, String genre) {
        this.image = image;
        this.singerName = singerName;
        this.genre = genre;
        //constructor
    }

    public int getImage() {
        return image;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getGenre() {
        return genre;
    }

}
