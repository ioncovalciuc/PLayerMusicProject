package com.example.userappplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());



        //Music music = context.getBean("musicBean",Music.class);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getTimePlaying());
//        System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
