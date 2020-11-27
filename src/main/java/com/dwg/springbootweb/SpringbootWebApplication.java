package com.dwg.springbootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.dwg.springbootweb.controller")
@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
		System.out.println("End");

		// TODO:  write a controller, for get and post print hello to screen
		// TODO:  write a controller to service to repo layers (inject service layer)
		// TODO:  generate a view and show it on page with model content

	}

}
