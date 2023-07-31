package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //use to handle http request
public class IndexController {
	
	@GetMapping("/") //index page open on project start
	public String index() {
		return "Index";
	}
}
