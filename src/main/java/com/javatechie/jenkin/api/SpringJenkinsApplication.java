package com.javatechie.jenkin.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsApplication {


	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@javax.annotation.PostConstruct
	public void init() {
		logger.info("Application Started");
	}	
	
	public String saySomeThing() {
		logger.info("Application Started");
		return "Heeeee Suneel";
	}

	public static void main(String[] args) {
		logger.info("Application Excuted");
		new SpringJenkinsApplication().saySomeThing();
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
