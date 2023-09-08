package com.socialmedia.tiktok.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.socialmedia.tiktok.api.Video;

@Repository
public class VideoDAOImpl implements VideoDAO {

	@Override
	public List<Video> loadVideos() {
		List<Video> videoList = new ArrayList<Video>(); 
		return videoList;
	}

}
