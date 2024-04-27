package com.bookingcare.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingcare.model.SubmitAnswers;
import com.bookingcare.repository.SubmitAnswerRepository;
import com.bookingcare.service.SubmitAnswerService;

@Service
public class SubmitAnswerServiceImpl implements SubmitAnswerService {

	@Autowired
	private SubmitAnswerRepository submitAnswerRepository;

	@Override
	public SubmitAnswers submit(SubmitAnswers submit) {
		return submitAnswerRepository.save(submit);
	}

}
