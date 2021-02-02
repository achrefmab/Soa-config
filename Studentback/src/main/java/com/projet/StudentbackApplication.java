package com.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentbackApplication.class, args);
	}

}
