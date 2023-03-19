package com.leif.assignment.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DateAndTime {
@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

@GetMapping("/time")
public String Times(Model model) {
	
	SimpleDateFormat time = new SimpleDateFormat("h:mm: a");
	Date date = new Date();
	
	model.addAttribute("time",time.format(date));
	return "Time.jsp";
}

@GetMapping("/date")
public String time(Model model) {
	
	SimpleDateFormat SdateF = new SimpleDateFormat("EEEE MMMM dd yyyy");
	Date date = new Date();
	model.addAttribute("date",SdateF.format(date));
	
	
	
	return "Date.jsp";
}


}
