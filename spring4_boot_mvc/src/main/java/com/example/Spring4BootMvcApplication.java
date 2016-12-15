package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//
@SpringBootApplication
public class Spring4BootMvcApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Spring4BootMvcApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Spring4BootMvcApplication.class);

        app.run(args);
    }
}
