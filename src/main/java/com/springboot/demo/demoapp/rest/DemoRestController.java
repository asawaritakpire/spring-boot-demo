package com.springboot.demo.demoapp.rest;

import com.springboot.demo.demoapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoRestController {

    @Value("${author.name}")
    private String authorName;

    private Coach myCoach;
      //Constructor Injection

    @Autowired
    public DemoRestController(@Qualifier("swimCoach") Coach coach){
        System.out.println("Initialized "+ getClass().getSimpleName());
        myCoach = coach;

    }



   /* @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach coach)
    {
        myCoach = coach;
    }*/

    @GetMapping("/")
    public String getMethoddemo()
    {
        return "Hello " + authorName;
    }

    @GetMapping("/name")
    public String getName()
    {
        return authorName;
    }

    @GetMapping("/getWorkout")
    public  String getWorkout()
    {
        return myCoach.getDailyWorkout();
    }

    /*@GetMapping("/check")
    public String check()
    {
        return  "Comparing beans: myCoach == anotherCoach : "+ (myCoach == anotherCoach);
    }*/
}
