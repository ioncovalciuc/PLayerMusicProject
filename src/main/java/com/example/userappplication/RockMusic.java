package com.example.userappplication;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "RockMusic playing";
    }
}
