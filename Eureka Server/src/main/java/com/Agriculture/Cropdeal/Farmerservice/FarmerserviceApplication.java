package com.Agriculture.Cropdeal.Farmerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class FarmerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmerserviceApplication.class, args);
	}

}
