package com.bookingcare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingcare.model.Question;
import com.bookingcare.service.QuestionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/questions")
@Tag(name = "Questions")
public class QuestionsControler {

	@Autowired
	private QuestionService questionService;

	@Operation(summary = "Get list questions", description = "API get list questions")
	@GetMapping()
	public ResponseEntity<List<Question>> findAll() {
		return ResponseEntity.ok(questionService.findAll());
	}

	@Operation(summary = "Get question", description = "API get question")
	@GetMapping("/{questionId}")
	public ResponseEntity<Question> findCategory(@PathVariable Integer questionId) {
		Optional<Question> categoryOptional = questionService.getQuestionById(questionId);
		return categoryOptional.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

}
