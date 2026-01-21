package com.exercise.content_calendar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ContentCalendarApplication.class, args);
	RestTemplate restTemplate =  (RestTemplate) context.getBean("restTemplate");
	System.out.println(restTemplate);
	}
	
	@Bean
	CommandLineRunner commandLineRunner() {
		return args ->
			System.out.println("Hello Alen!");
		
		
	}

}
