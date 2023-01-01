package com.sy.basicmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BasicMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicMvcApplication.class, args);
	}

}
