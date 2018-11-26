package com.example.Weatherforcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.Controller")
public class WeatherforcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherforcastApplication.class, args);
	}
}
