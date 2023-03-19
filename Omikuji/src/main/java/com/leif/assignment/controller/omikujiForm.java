package com.leif.assignment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class omikujiForm {
	
	@GetMapping("/")
	public String indexMainForm() {
		return "redirect:/omikuji";
	}
	
	
	@GetMapping("/omikuji")
	public String indexForm() {
		
		return "index.jsp";
	}
	

	@GetMapping("/omikuji/show")
	public String createOmikuji(Model model, HttpSession session) {
		
		String result = (String) session.getAttribute("OmikujiUser");
		model.addAttribute("result",result);
		
		
		return "showOmikujiFortune.jsp";
	}
	
	
	@PostMapping("/omikuji/create")
	public String omikujiPost( @RequestParam("number") int number, @RequestParam("city") String city, @RequestParam("name") String name, @RequestParam("hobby") String hobby, @RequestParam("living")  String living, @RequestParam("message") String message, HttpSession session) {
		
		String OmikujiUser = String.format("In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", number, city, name,hobby,living,message);
		session.setAttribute("OmikujiUser",OmikujiUser);
		
		return "redirect:/omikuji/show";
	}
	
	

}
