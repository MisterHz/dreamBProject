package com.project.dream;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyDreamApplication {

	@GetMapping("/message")
	public String massage(){
		return "Congrats successfully in Azure !!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyDreamApplication.class, args);
		// SpringApplication app = new SpringApplication(MyDreamApplication.class);
        // app.setDefaultProperties(Collections
        //   .singletonMap("server.port", "8083"));
        // app.run(args);
	}

}
