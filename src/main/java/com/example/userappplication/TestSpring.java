package com.example.userappplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// all code from this class has been procesed with  java code and xml file

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getTimePlaying());

//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);




//Music music = context.getBean("musicBean",Music.class);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getTimePlaying());
//        System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
