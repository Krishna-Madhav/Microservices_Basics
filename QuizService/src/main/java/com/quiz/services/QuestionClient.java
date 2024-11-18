package com.quiz.services;

import com.quiz.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/*
*  This class is responsible for establishing communication between quiz service and question service. It makes a call to Question service
*  using an endpoint exposed by it and fetches the output.
* */

// @FeignClient(url = "http://localhost:8082", value = "Question-Client")

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz( @PathVariable Long quizId);
}
