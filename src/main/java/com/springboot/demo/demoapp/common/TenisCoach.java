package com.springboot.demo.demoapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Play Tennis for 15 mins daily!!";
    }
}
