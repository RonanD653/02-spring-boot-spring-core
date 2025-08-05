package com.udemyspringboot.__spring_boot_spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com/udemyspringboot/util",
        "com/udemyspringboot/__spring_boot_spring_core"}
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
