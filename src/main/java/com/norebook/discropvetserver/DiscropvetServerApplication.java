package com.norebook.discropvetserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscropvetServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscropvetServerApplication.class, args);
	}

}
