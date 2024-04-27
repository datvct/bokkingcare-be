package com.bookingcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookingcare.model.SubmitAnswers;

@Repository
public interface SubmitAnswerRepository extends JpaRepository<SubmitAnswers, Integer>{

}
