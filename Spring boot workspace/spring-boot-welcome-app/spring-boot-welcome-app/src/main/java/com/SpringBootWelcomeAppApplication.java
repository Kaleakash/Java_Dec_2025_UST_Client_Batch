package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication	
public class SpringBootWelcomeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWelcomeAppApplication.class, args);	// it is use to lauch the spring boot application 
		System.out.println("spring boot up");
	}

}
