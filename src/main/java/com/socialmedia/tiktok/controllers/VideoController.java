package com.socialmedia.tiktok.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideoController {
	
	@GetMapping("/showVideo")
	public String showVideoList() {
		return "video-list";
	}

}
