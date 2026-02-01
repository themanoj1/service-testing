package com.microservices.service_testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceTestingApplication {

	public static void main(String[] args) {
        System.out.println("invoking application contact which is implementation of oic container");
		SpringApplication.run(ServiceTestingApplication.class, args);
	}

}
