package com.azerothai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AzerothAiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzerothAiApiApplication.class, args);
	}

	@GetMapping("/saludar")
	public String saludar(
			@org.springframework.web.bind.annotation.RequestParam String nombre) {
		return "¡Bienvenido a Azeroth, " + nombre + "!";
	}
}
