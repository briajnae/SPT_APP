package com.parker.sptuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SptUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SptUserApplication.class, args);
	}

}
