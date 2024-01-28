package com.example.labaratotka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LabaratotkaApplication {

	@GetMapping("/")
	public String index(){

		return "Ушаков";
	}
	public static void main(String[] args) {
		SpringApplication.run(LabaratotkaApplication.class, args);
	}

}
