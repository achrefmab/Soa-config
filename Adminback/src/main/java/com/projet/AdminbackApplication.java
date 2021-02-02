package com.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class AdminbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminbackApplication.class, args);
	}

}
