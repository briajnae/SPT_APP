package com.parker.sptserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SptServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SptServiceRegistryApplication.class, args);
	}

}
