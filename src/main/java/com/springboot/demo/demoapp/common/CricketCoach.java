package com.springboot.demo.demoapp.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Play Cricket";
    }
}
