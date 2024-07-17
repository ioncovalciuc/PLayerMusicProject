package com.example.userappplication;

import org.springframework.stereotype.Component;

@Component
public class HouseMusic implements Music{

    @Override
    public String getSong() {
        return "HouseMusic playing";
    }
}
