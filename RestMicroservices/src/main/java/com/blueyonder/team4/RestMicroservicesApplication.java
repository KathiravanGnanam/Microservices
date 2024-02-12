package com.blueyonder.team4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RestMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestMicroservicesApplication.class, args);
	}

}
