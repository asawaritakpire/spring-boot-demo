package com.springboot.demo.demoapp.common;

public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim daily for 15 min!!!";
    }
}
