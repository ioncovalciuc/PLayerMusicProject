package com.example.userappplication;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private double timePlaying;

    //IoC
//    public MusicPlayer(Music music){
//        this.music = music;
//    }
    public MusicPlayer() {}
    public void playMusic(){
        System.out.println("Player : " + music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getTimePlaying() {
        return timePlaying;
    }

    public void setTimePlaying(double timePlaying) {
        this.timePlaying = timePlaying;
    }
}
