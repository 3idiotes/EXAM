package com.engin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/index")
public class IndexController  {
	
	@RequestMapping("/index")
	public RedirectView index(){	
		return new RedirectView("/user/loginm",true,false,false);	
		
	}
}
