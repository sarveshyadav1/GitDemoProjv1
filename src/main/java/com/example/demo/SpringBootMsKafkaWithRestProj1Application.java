package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication

@EnableKafka
public class SpringBootMsKafkaWithRestProj1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsKafkaWithRestProj1Application.class, args);
	}

}
