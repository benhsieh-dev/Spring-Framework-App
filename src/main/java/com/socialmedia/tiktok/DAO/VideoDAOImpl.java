package com.socialmedia.tiktok.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.socialmedia.tiktok.api.Video;
import com.socialmedia.tiktok.rowmapper.VideoRowMapper;
@Repository
public class VideoDAOImpl implements VideoDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 

	@Override
	public List<Video> loadVideos() {
		
		String sql = "SELECT * FROM videos"; 
		
		List<Video> theListOfVideo = jdbcTemplate.query(sql, new VideoRowMapper()); 
		
		return theListOfVideo; 
		
	}

}
