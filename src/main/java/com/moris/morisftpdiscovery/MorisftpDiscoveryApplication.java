package com.moris.morisftpdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MorisftpDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MorisftpDiscoveryApplication.class, args);
	}

}
