package com.socialmedia.tiktok.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.socialmedia.tiktok.api.Video;

public class VideoRowMapper implements RowMapper<Video> {

	public Video mapRow(ResultSet rs, int rowNum) throws SQLException {
		rs.getInt("id");
		rs.getString("title");
		rs.getString("url");
		rs.getString("username");
		rs.getString("country");
		
		return null;
	}

}
