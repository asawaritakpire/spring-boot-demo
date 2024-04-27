package com.springboot.demo.demoapp.common;


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

    //define init method
    /*@PostConstruct
    public void startUpMethod(){
        System.out.println("In startUpMethod() : "+ getClass().getSimpleName());
    }


    //define destroy method
    @PreDestroy
    public void cleanUpMethod(){
        System.out.println("In cleanUpMethod () : "+ getClass().getSimpleName());
    }*/
}
