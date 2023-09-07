package com.socialmedia.tiktok.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.socialmedia.tiktok.DAO.VideoDAO;
import com.socialmedia.tiktok.DAO.VideoDAOImpl;
import com.socialmedia.tiktok.api.Video;

@Controller
public class VideoController {
	
	@Autowired
	private VideoDAO videoDAO; 
			
	@GetMapping("/showVideo")
	public String showVideoList() {
		
		List<Video> videoList = videoDAO.loadVideos(); 
		return "video-list";
	}

}
