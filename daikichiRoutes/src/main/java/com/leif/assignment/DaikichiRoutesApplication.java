package com.leif.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	
	@RequestMapping(value ="/daikichi", method=RequestMethod.GET)
	public String index() {
		return "Welcome! ";
	}
	
	@RequestMapping(value ="/daikichi/today", method=RequestMethod.GET)
	public String today() {
		return "Today will find luck in all endeavors!";
	}
	
	@RequestMapping(value="daikichi/tomorrow", method=RequestMethod.GET)
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, be sure to be open to new ideas";
	}
	
	@RequestMapping("/daikichi/{travel}/{location}")
	public String daikichiRoutes(@PathVariable("travel") String travel, @PathVariable("location") String  location) {
		return "Congratulations you will soon to "+ travel + " " + location;
	}
	
	
	@RequestMapping("/daikichi/{lotto}")
	public String daikichiLotto(@PathVariable("lotto") int lotto) {
		if (lotto  % 2== 0 ) {
			return "You will take a grand journey in the near future ";
		}
		return "You have enjoyed the fruits of labor but now is a great time to spend time with family and friends";
		
		
	
	}
	
	
}
	
	
	
	

