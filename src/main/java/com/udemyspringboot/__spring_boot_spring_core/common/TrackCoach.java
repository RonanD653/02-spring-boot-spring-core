package com.udemyspringboot.__spring_boot_spring_core.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }
}
