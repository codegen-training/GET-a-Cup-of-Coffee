package com.example.getcoffee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GetCoffeeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GetCoffeeApplication.class, args);
    }

    //@Autowired
    //OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        log.info("Command line runner");
    }
}
