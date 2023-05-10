package com.test.thy.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequestMapping("")

public class Controller {
//	@GetMapping("/login")
	@RequestMapping("/login")
	public String login() {
		return "login.html" ;
	}

}
