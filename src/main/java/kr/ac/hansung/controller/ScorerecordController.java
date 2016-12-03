package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Scorerecord;
import kr.ac.hansung.service.ScorerecordService;

@Controller
public class ScorerecordController {

	private ScorerecordService scorerecordService;

	@Autowired
	public void setScorerecordService(ScorerecordService scorerecordService) {
		this.scorerecordService = scorerecordService;
	}
	//
	// @RequestMapping("/scorerecord")
	// public String showScorerecord(Model model) {
	//
	// List<Scorerecord> scorerecord = scorerecordService.getCurrent();
	//
	// model.addAttribute("scorerecord", scorerecord);
	// return "scorerecord";
	// }

	@RequestMapping("/semesterscorerecord")
	public String semesterScorerecord(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getCurrent(); // 일단 전부 가져옴
		int y1 = 0, y2 = 0, y3 = 0, y4 = 0, y5 = 0;

		for (Scorerecord record : scorerecord) {
			if (record.getYear()==2014&&record.getSemester()==1) {
				y1 += record.getScore();
			}
			else if (record.getYear()==2014&&record.getSemester()==2)
				y2 += record.getScore();
			else if (record.getYear()==2015&&record.getSemester()==1)
				y3 += record.getScore();
			else if (record.getYear()==2015&&record.getSemester()==2)
				y4 += record.getScore();
			else if (record.getYear()==2016&&record.getSemester()==1)
				y5 += record.getScore();
		}
		
		model.addAttribute("y1", y1);
		model.addAttribute("y2", y2);
		model.addAttribute("y3", y3);
		model.addAttribute("y4", y4);
		model.addAttribute("y5", y5);

		return "semesterscorerecord";
	}

	@RequestMapping("/divscorerecord")
	public String divScorerecord(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getCurrent(); // 일단 전부 가져옴
		int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, sum = 0;

		for (Scorerecord record : scorerecord) {
			if (record.getDiv().equals("전기"))
				d1 += record.getScore();
			else if (record.getDiv().equals("전선"))
				d2 += record.getScore();
			else if (record.getDiv().equals("전지"))
				d3 += record.getScore();
			else if (record.getDiv().equals("필교"))
				d4 += record.getScore();
			else if (record.getDiv().equals("핵교A"))
				d5 += record.getScore();
			else if (record.getDiv().equals("핵교B"))
				d6 += record.getScore();
			else
				d7 += record.getScore();
		}

		sum = d1 + d2 + d3 + d4 + d5 + d6 + d7;
		
		model.addAttribute("d1", d1);
		model.addAttribute("d2", d2);
		model.addAttribute("d3", d3);
		model.addAttribute("d4", d4);
		model.addAttribute("d5", d5);
		model.addAttribute("d6", d6);
		model.addAttribute("d7", d7);
		model.addAttribute("sum", sum);

		return "divscorerecord";
	}

	@RequestMapping("/createscorerecord")
	public String createScorerecord(Model model) {

		model.addAttribute(new Scorerecord());
		return "createscorerecord";
	}

	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Scorerecord scorerecord, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("Form data does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError error : errors)
				System.out.println(error.getDefaultMessage());
			return "createscorerecord";
		}
		scorerecordService.insert(scorerecord);
		return "scorerecordcreated";
	}

	@RequestMapping("/newscorerecord")
	public String newScorerecord(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getNextScorerecord();
		model.addAttribute("scorerecord", scorerecord);

		return "newscorerecord";
	}
	
	@RequestMapping("/first")
	public String first(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getNextScorerecord1();
		model.addAttribute("scorerecord", scorerecord);

		return "first";
	}
	
	@RequestMapping("/second")
	public String second(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getNextScorerecord2();
		model.addAttribute("scorerecord", scorerecord);

		return "second";
	}
	
	@RequestMapping("/third")
	public String third(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getNextScorerecord3();
		model.addAttribute("scorerecord", scorerecord);

		return "third";
	}
	
	@RequestMapping("/fourth")
	public String fourt(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getNextScorerecord4();
		model.addAttribute("scorerecord", scorerecord);

		return "fourth";
	}
	@RequestMapping("/fifth")
	public String fifth(Model model) {

		List<Scorerecord> scorerecord = scorerecordService.getNextScorerecord5();
		model.addAttribute("scorerecord", scorerecord);

		return "fifth";
	}

}
