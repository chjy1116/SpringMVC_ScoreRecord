package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.ScoreDAO;
import kr.ac.hansung.model.Scorerecord;

@Service
public class ScorerecordService {

	private ScoreDAO scoreDao;

	@Autowired
	public void setScoreDao(ScoreDAO scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	public List<Scorerecord> getCurrent() {
		return scoreDao.getScore();
	}
	
	public List<Scorerecord> getNextScorerecord1() {
		return (List<Scorerecord>) scoreDao.getScore(2014, 1);
	}
	public List<Scorerecord> getNextScorerecord2() {
		return (List<Scorerecord>) scoreDao.getScore(2014, 2);
	}
	public List<Scorerecord> getNextScorerecord3() {
		return (List<Scorerecord>) scoreDao.getScore(2015, 1);
	}
	public List<Scorerecord> getNextScorerecord4() {
		return (List<Scorerecord>) scoreDao.getScore(2015, 2);
	}
	public List<Scorerecord> getNextScorerecord5() {
		return (List<Scorerecord>) scoreDao.getScore(2016, 1);
	}
	public List<Scorerecord> getNextScorerecord() {
		return (List<Scorerecord>) scoreDao.getScore(2017, 1);
	}

	public void insert(Scorerecord scorerecord) {
		scoreDao.insert(scorerecord);
	}
}
