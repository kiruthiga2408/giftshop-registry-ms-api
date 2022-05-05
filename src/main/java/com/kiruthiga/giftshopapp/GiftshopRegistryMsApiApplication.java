package com.kiruthiga.giftshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class GiftshopRegistryMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiftshopRegistryMsApiApplication.class, args);
	}

}
