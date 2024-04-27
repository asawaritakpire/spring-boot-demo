package com.springboot.demo.demoapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{


    public TenisCoach(){
        System.out.println("Initialized "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play Tennis for 15 mins daily!!";
    }
}
