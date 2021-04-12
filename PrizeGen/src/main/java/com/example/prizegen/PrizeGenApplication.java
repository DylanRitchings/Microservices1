package com.example.prizegen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableWebMvc
public class PrizeGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrizeGenApplication.class, args);
    }

}
