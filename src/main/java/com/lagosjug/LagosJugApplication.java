package com.lagosjug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LagosJugApplication {

	public static void main(String[] args) {
		SpringApplication.run(LagosJugApplication.class, args);
	}
	
	
}
