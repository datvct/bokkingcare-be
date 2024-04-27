package com.bookingcare.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingcare.dto.request.QuestionRequestDTO;
import com.bookingcare.model.Question;
import com.bookingcare.repository.QuestionRepository;
import com.bookingcare.service.QuestionService;


@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	

	@Override
	public List<Question> findAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question save(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Optional<Question> getQuestionById(int id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id);
	}

	
   
}
