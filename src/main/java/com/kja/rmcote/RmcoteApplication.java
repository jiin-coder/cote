package com.kja.rmcote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RmcoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmcoteApplication.class, args);
	}

	@GetMapping(value = "/")
	public String HelloWorld(){
		return "Hello World";
	}

}
