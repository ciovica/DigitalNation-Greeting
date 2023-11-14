package com.example.Track;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrackApplication {

	public record Greeting(long id, String content) {

	}

	public static void main(String[] args) {
		SpringApplication.run(TrackApplication.class, args);
	}

}
