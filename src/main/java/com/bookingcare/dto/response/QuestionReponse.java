package com.bookingcare.dto.response;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class QuestionReponse implements Serializable {

	private int questionId;
	private String question;
	private List<String> options;
	private List<Integer> answers;

	public QuestionReponse(int questionId, String question, List<String> options, List<Integer> answers) {
		this.questionId = questionId;
		this.question = question;
		this.options = options;
		this.answers = answers;
	}

}
