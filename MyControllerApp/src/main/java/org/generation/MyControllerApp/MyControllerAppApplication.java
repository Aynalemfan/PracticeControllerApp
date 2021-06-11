package org.generation.MyControllerApp;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyControllerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyControllerAppApplication.class, args);
	}
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


}
