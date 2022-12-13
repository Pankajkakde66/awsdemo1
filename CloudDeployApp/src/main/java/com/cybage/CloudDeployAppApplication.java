package com.cybage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudDeployAppApplication {

	@GetMapping("/")
	public String home() {
		return "Welcome to AWS";
	}
	public static void main(String[] args) {
		SpringApplication.run(CloudDeployAppApplication.class, args);
	}

}
