package com.example.PCBE;

import com.example.PCBE.controllers.Counter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PcbeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcbeApplication.class, args);
	}

	@Bean
	public Counter counter() {
		return new Counter();
	}
}
