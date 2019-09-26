package com.yunsam.kj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.yunsam.kj.*"})
public class KjApplication {
    public static void main(String[] args) {
        SpringApplication.run(KjApplication.class, args);
    }

}
