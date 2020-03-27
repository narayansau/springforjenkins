package com.example.springforjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringforjenkinsApplication{

	public static void main(String[] args) {
		SpringApplication.run( SpringforjenkinsApplication.class, args );
		
		System.out.print( "Hey I am here" );
	}

}
