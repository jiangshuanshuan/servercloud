package com.example.servercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServercloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServercloudApplication.class, args);
	}
}
