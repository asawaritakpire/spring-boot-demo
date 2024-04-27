package com.springboot.demo.demoapp.common;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play Tennis for 15 mins daily!!";
    }
}
