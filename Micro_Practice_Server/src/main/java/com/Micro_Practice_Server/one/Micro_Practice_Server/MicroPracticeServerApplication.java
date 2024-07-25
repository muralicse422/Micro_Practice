package com.Micro_Practice_Server.one.Micro_Practice_Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroPracticeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroPracticeServerApplication.class, args);
	}

}
