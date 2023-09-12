package com.socialmedia.tiktok.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.socialmedia.tiktok.api.Video;
import com.socialmedia.tiktok.rowmapper.VideoRowMapper;
@Repository
public class VideoDAOImpl implements VideoDAO {
	
	JdbcTemplate jdbcTemplate; 

	@Override
	public List<Video> loadVideos() {
		List<Video> videoList = new ArrayList<Video>(); 
		
		String sql = "SELECT * FROM videos"; 
		
		jdbcTemplate.query(sql, new VideoRowMapper()); 
	}

}
