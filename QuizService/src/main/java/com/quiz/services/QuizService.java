package com.quiz.services;

import java.util.List;

import com.quiz.entities.Quiz;

public interface QuizService {

	// Add quiz
	Quiz add(Quiz quiz);

	// Get all quiz
	List<Quiz> getAllQuiz();

	// Get quiz based on Quiz Id
	Quiz getQuiz(Long id);
}
