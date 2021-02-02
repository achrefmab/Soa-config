package com.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeacherbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherbackApplication.class, args);
	}

}
