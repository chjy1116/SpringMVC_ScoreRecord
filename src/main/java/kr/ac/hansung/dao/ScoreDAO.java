package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Scorerecord;

@Repository
public class ScoreDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	// public int getRowCount() {
	// String sqlStatement = "select count(*) from scorerecord";
	// return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	// }

	// querying and returning a single object
//	public List<Scorerecord> getScore(String div) {
//		String sqlStatement = "select * from scorerecord where div=?";
//
//		return jdbcTemplateObject.query(sqlStatement, new Object[] { div }, new ScoreMapper());
//	}

	// querying and returning a single object
	public List<Scorerecord> getScore(int year, int semester) {
		String sqlStatement = "select * from scorerecord where year=? and semester=?";

		return jdbcTemplateObject.query(sqlStatement, new Object[] { year, semester }, new ScoreMapper());
	}

	// querying and returning a multiple object
	public List<Scorerecord> getScore() {
		String sqlStatement = "select * from scorerecord";

		return jdbcTemplateObject.query(sqlStatement, new ScoreMapper());
	}

	public boolean insert(Scorerecord scorerecord) {

		int year = scorerecord.getYear();
		int semester = scorerecord.getSemester();
		String code = scorerecord.getCode();
		String name = scorerecord.getName();
		String div = scorerecord.getDiv();
		int score = scorerecord.getScore();

		String sqlStatement = "insert into scorerecord values (?, ?, ?, ?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { year, semester, code, name, div, score }) == 1);
	}
}
