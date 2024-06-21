package com.udemyspringboot.__spring_boot_spring_core.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("In doMyStartUpStuff(): " +getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("In doMyCleanUpStuff(): " +getClass().getSimpleName());
    }

    public CricketCoach() {
        System.out.println("In container " + getClass().getSimpleName());
    }
}
