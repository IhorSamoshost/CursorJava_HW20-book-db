package com.cursor.bookdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@EnableJpaRepositories("com.cursor.bookdb")
@SpringBootApplication
public class BookDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookDbApplication.class, args);
    }

}
