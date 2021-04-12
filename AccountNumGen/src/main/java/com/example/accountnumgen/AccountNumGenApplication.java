package com.example.accountnumgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableWebMvc
public class AccountNumGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountNumGenApplication.class, args);
    }

}
