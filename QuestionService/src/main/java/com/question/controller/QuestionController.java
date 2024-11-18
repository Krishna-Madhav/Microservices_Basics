package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/{questionId}")
    public Question getQuestions(Long questionId){
        return questionService.getQuestionById(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuizId(@PathVariable Long quizId ){
        return questionService.getQuestionsOfQuiz(quizId);
    }

}