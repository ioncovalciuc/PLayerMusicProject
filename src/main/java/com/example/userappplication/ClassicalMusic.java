package com.example.userappplication;

import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music{
//    private ClassicalMusic() {}
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//    public void doMyInit() {
//        System.out.println("Doing in my init method");
//    }
//    public void doMyDestroy() {
//        System.out.println("Doing in my destroy method");
//    }
//    @Override
    public String getSong() {
        return "ClassicalMusic playing";
    }
}
