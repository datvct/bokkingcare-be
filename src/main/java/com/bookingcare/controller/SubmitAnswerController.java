package com.bookingcare.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingcare.dto.request.QuestionRequestDTO;
import com.bookingcare.dto.response.ResponseData;
import com.bookingcare.model.Question;
import com.bookingcare.model.ResultSumbit;
import com.bookingcare.model.SubmitAnswers;
import com.bookingcare.repository.QuestionRepository;
import com.bookingcare.service.QuestionService;
import com.bookingcare.service.SubmitAnswerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/submit-answer")
@Tag(name = "Submit Answer")
public class SubmitAnswerController {

	@Autowired
	private SubmitAnswerService submitAnswerService;

	@Operation(summary = "Add sumbit-answer", description = "API create new sumbit answer")
	@PostMapping()
	public ResultSumbit save(@RequestBody SubmitAnswers submit) {
		try {
			submitAnswerService.submit(submit);
			int totalPoint = 0;
			for (int i = 0; i < submit.getAnswers().size(); i++) {
				totalPoint += submit.getAnswers().get(i).intValue();
			}
			String message;
			if (totalPoint < 14) {
				message = "Không biểu hiện trầm cảm";
			} else if (totalPoint < 20) {
				message = "Trầm cảm nhẹ";
			} else if (totalPoint < 30) {
				message = "Trầm cảm vừa";
			} else {
				message = "Trầm cảm nặng";
			}
			ResultSumbit result = new ResultSumbit(totalPoint, message);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
	