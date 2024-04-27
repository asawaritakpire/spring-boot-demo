package com.springboot.demo.demoapp.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    public  CricketCoach()
    {
        System.out.println("Initialized "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play Cricket 15 mins daily!!!!!!!";
    }
}
