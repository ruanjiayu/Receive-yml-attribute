package com.jing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties
public class YmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(YmlApplication.class, args);
	}

}
