package com.socialmedia.tiktok.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.socialmedia.tiktok.DAO.VideoDAO;
import com.socialmedia.tiktok.DAO.VideoDAOImpl;
import com.socialmedia.tiktok.api.Video;

@Controller
public class VideoController {
	
	VideoDAO videoDAO = new VideoDAOImpl(); 
			
	@GetMapping("/showVideo")
	public String showVideoList() {
		
		List<Video> loadVideos = videoDAO.loadVideos(); 
		return "video-list";
	}

}
