package com.repository.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class RepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepositoryApplication.class, args);
    }

}
