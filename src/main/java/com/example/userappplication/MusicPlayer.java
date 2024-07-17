package com.example.userappplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Value("${musicPlayer.timePlaying}")
    private double timePlaying;
    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("houseMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public double getTimePlaying() {
        return timePlaying;
    }

    public String playMusic() {
        return "Player : " + music1.getSong() +
                " " + music2.getSong();
    }


}
