package com.iskcon.au.dims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })


@SpringBootApplication
public class DimsSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DimsSpringAppApplication.class, args);
	}

}
