 

package com.bookingcare.service;

import java.util.List;
import java.util.Optional;
import com.bookingcare.dto.request.QuestionRequestDTO;
import com.bookingcare.model.Question;

public interface QuestionService {

	Optional<Question> getQuestionById(int id);

	List<Question> findAll();

	Question save(Question question);


}
