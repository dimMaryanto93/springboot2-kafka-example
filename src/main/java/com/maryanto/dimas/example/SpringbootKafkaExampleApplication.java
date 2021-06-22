package com.maryanto.dimas.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class SpringbootKafkaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaExampleApplication.class, args);
    }

}
