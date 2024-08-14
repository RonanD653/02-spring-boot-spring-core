package com.udemyspringboot.__spring_boot_spring_core.config;

import com.udemyspringboot.__spring_boot_spring_core.common.Coach;
import com.udemyspringboot.__spring_boot_spring_core.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
