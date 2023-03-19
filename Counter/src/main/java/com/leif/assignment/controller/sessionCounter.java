package com.leif.assignment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class sessionCounter {

	@RequestMapping("/")
	public String sessCount(HttpSession session, Model model) {
		
		
	Integer count=0;
		
		
			if (session.getAttribute("count") == null) {
				session.setAttribute("count",0);
		}else {
			count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String visitorsSession(HttpSession session) {

		return "Counter.jsp";
	}
	
	@RequestMapping("/thirdPage")
	public String thirdPage(HttpSession session, Model model) {
		
		Integer count=0;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", count);
		}else {
			count = (Integer) session.getAttribute("count");
			count+=2;
			session.setAttribute("count", count);
		}
		
		return "third.jsp";
		
	}
	
	
	
}
