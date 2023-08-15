package com.socialmedia.tiktok.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/showUser")
	public String showUserList() {
		return "user-list";
	}

}
