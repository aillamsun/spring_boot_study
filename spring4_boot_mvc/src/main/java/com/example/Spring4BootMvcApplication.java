package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring4BootMvcApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Spring4BootMvcApplication.class);

        app.run(args);
    }
}
