package com.sjprogramming.springmysqlex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg","welcome to my world");
		mav.setViewName("index");
		return mav;
		
	}
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","hello vikas");
		mav.setViewName("index");
		
				
		return mav;
	}

}
