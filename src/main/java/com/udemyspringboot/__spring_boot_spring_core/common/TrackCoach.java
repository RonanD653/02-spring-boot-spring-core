package com.udemyspringboot.__spring_boot_spring_core.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }

    public TrackCoach() {
        System.out.println("In container " + getClass().getSimpleName());
    }
}
