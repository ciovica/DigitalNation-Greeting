package com.example.Greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication {

	public record Greeting(long id, String content) {

	}

	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
	}

}
