package kr.ac.hansung.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Scorerecord {

	@Min(value = 1990)
	@Max(value = 2050)
	@NotNull(message = "Year cannnot be empty")
	private int year;

	@Min(value = 1)
	@Max(value = 3)
	@NotNull(message = "Semester cannnot be empty")
	private int semester;

	@Size(min = 7, max = 7, message = "Code must be 7chars")
	@NotEmpty(message = "Code cannnot be empty")
	private String code;

	@Size(min = 2, max = 100, message = "Name must be between 2 and 100 chars")
	@NotEmpty(message = "Name cannnot be empty")
	private String name;

	@Size(min = 2, max = 10, message = "Div must be between 2 and 10 chars")
	@NotEmpty(message = "Div cannnot be empty")
	private String div;

	@Min(value = 1)
	@Max(value = 4)
	@NotNull(message = "Score cannnot be empty")
	private int score;

	public Scorerecord() {
		this.year = 2017;
		this.semester = 1;
		this.score = 3;
	}

	public Scorerecord(int year, int semester, String code, String name, String div, int score) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.div = div;
		this.score = score;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Scorerecord [year=" + year + ", semester=" + semester + ", code=" + code + ", name=" + name + ", div="
				+ div + ", score=" + score + "]";
	}
}
