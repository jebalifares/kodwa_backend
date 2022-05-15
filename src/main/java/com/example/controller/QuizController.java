package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Category;
import com.example.model.Quiz;
import com.example.service.QuizService;


	
@RestController
@CrossOrigin("*")
@RequestMapping("api/quiz")

public class QuizController {

    @Autowired
    private QuizService quizService;

    //add quiz
    @PostMapping("/")
    public ResponseEntity<?> addQuiz(@RequestBody Quiz quiz)
    {
        return ResponseEntity.ok(this.quizService.addQuiz(quiz));
    }
    //update quiz
    @PutMapping("/")
    public ResponseEntity<?> updateQuiz(@RequestBody Quiz quiz)
    {
        return ResponseEntity.ok(this.quizService.UpdateQuiz(quiz));
    }
    //get quiz
    @GetMapping("/")
    public ResponseEntity<?> getQuizzes()
    {
        return ResponseEntity.ok(this.quizService.getQuizes());
    }

    //get single quiz	
    @GetMapping("{qid}")
    public Quiz getSingleQuiz(@PathVariable("qid") Long qid)
    {
    	
        return this.quizService.getQuizById(qid);
    }
    //delete Quiz
    @DeleteMapping("/{qid}")
    public void deleteQuiz(@PathVariable("qid") Long qid)
    {
        
        this.quizService.deleteQuizById(qid);
    }
    
    //get quiz of particular category
   @GetMapping("/category/{cid}")
    public List<Quiz> getQuizOfCategory(@PathVariable("cid") Long cid)
    {
	   Category cat=new Category();
    	cat.setCid(cid);
    	return (this.quizService.getQuizzesOfCategory(cat));
    	
    }
}



