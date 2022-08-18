package com.deloitte.elasticbeanstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ElasticBeanstalkApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ElasticBeanstalkApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ElasticBeanstalkApplication.class);
	}
}
