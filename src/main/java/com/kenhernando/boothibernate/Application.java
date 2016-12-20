package com.kenhernando.boothibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * If this class is placed elsewhere, add scanBasePackages as a parameter and define packages to be scanned:
 * @SpringBootApplication(scanBasePackages = {"package1", "package2"})
 */

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
