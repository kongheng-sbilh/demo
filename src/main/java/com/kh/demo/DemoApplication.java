package com.kh.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DemoApplication.class);
		StandardEnvironment environment = new StandardEnvironment();
		try {
			String homeDir = System.getProperty("user.home");
			String propertyFilePath = homeDir + "/app/property/application.properties";
			ResourcePropertySource propertySource = new ResourcePropertySource("externalProperty", "file:" + propertyFilePath);
			environment.getPropertySources().addFirst(propertySource);
			application.setEnvironment(environment);
		} catch (Exception exception) {
			log.error("error: can not find the application.properties file", exception);
		}
		application.run(args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
