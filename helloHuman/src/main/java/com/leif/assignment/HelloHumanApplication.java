package com.leif.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="Name", required=false) String Name, @RequestParam(value="last_name", required=false) String last_name ) {
		
		if (Name != null || last_name != null) {
				return "Hello! " +  Name + " " + last_name  ;
			}
		
		
		
			
			return "Hello human"; 
	}
	


}
