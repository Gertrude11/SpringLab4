package com.example.SpringLab4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringLab4Application implements CommandLineRunner {

	//@Autowired
	private SpringConfig config;

	@Autowired
	public SpringLab4Application(SpringConfig config) {
		this.config = config;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLab4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(config.getWelcomeMessage());

	}
}
