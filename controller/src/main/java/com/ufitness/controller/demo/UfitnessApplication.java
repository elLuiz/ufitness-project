package com.ufitness.controller.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.ufitness")
@ComponentScan({"com.ufitness"})
@EnableJpaRepositories({"com.repository"})
public class UfitnessApplication {
    public static void main(String[] args) {
        SpringApplication.run(UfitnessApplication.class, args);
    }
}
