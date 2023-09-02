package com.socialmedia.tiktok.DAO;

import java.util.List;

import com.socialmedia.tiktok.api.Video;

public interface VideoDAO {
	
	List<Video> loadVideos(); 

}
