package com.socialmedia.tiktok.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.socialmedia.tiktok.api.Video;

public class VideoRowMapper implements RowMapper<Video> {

	public Video mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Video video = new Video(); 
		
		video.setId(rs.getInt("id"));		
		video.setTitle(rs.getString("title"));
		video.setUrl(rs.getString("url"));
		video.setUsername(rs.getString("username"));
		video.setCountry(rs.getString("country"));
		
		return video;
	}

}
