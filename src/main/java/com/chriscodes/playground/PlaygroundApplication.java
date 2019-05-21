package com.chriscodes.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class PlaygroundApplication {

	public static void main(String[] args) {

		SpringApplication.run(PlaygroundApplication.class, args);
	}
}
