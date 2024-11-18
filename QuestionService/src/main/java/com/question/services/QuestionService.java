package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    // Create
    Question create(Question question);

    // Get All Questions
    List<Question> getAllQuestion();

    // Get Question using questionId
    Question getQuestionById(Long id);

    // Get Questions based on Quiz Id
    List<Question> getQuestionsOfQuiz(Long quizId);
}
