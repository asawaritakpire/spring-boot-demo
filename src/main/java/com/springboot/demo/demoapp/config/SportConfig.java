package com.springboot.demo.demoapp.config;

import com.springboot.demo.demoapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springboot.demo.demoapp.common.Coach;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
