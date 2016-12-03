package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Scorerecord;

public class ScoreMapper implements RowMapper{

	public Scorerecord mapRow(ResultSet rs, int rowNum) throws SQLException {
		Scorerecord scorerecord = new Scorerecord();
		scorerecord.setYear(rs.getInt("year"));
		scorerecord.setSemester(rs.getInt("semester"));
		scorerecord.setCode(rs.getString("code"));
		scorerecord.setDiv(rs.getString("div"));
		scorerecord.setName(rs.getString("name"));
		scorerecord.setScore(rs.getInt("score"));

		return scorerecord;

	}

}
