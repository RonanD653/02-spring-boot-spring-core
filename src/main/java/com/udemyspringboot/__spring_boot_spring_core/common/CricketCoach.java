package com.udemyspringboot.__spring_boot_spring_core.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    public CricketCoach() {
        System.out.println("In container " + getClass().getSimpleName());
    }
}
