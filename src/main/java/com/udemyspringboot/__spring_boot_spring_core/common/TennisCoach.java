package com.udemyspringboot.__spring_boot_spring_core.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }
}
