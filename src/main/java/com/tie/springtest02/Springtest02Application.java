package com.tie.springtest02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Springtest02Application {

	public static void main(String[] args) {
		SpringApplication.run(Springtest02Application.class, args);
	}
}
