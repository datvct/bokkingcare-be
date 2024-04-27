package com.bookingcare.dto.request;

import java.io.Serializable;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


public class QuestionRequestDTO implements Serializable {

	/**
	 * 
	 */

	@NotNull
	private int questionId;

	@NotEmpty
	private String question;

	@NotEmpty
	private List<String> options;

	@NotEmpty
	private List<Integer> answers;

	public QuestionRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuestionRequestDTO(int questionId, String question, List<String> options, List<Integer> answers) {
		this.questionId = questionId;
		this.question = question;
		this.options = options;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public List<Integer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Integer> answers) {
		this.answers = answers;
	}

	


}
