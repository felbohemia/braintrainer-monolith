package com.atamie.braintrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.atamie.braintrainer","configuration","authentication","gamification","multiplication"})
public class BraintrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BraintrainerApplication.class, args);
	}

}
