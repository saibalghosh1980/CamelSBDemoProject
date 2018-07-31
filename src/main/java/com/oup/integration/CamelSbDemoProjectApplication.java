package com.oup.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({ "classpath:META-INF/spring/camelContext.xml" })
public class CamelSbDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelSbDemoProjectApplication.class, args);
	}
}
