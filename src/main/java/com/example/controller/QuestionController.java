package com.example.controller;


import com.example.model.Question;
import com.example.model.Quiz;
import com.example.service.QuestionService;
import com.example.service.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/question")
@CrossOrigin("*")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    
    @Autowired
    private QuizService quizService;

    

    //add question

    @PostMapping("/")
    public ResponseEntity<?> addQuestion(@RequestBody Question question)
    {
    	
        return ResponseEntity.ok(this.questionService.addQuestion(question));
    }

    //update question
    @PutMapping("/")
    public ResponseEntity<?> updateQuestion(@RequestBody Question question)
    {
        return ResponseEntity.ok(this.questionService.UpdateQuestion(question));
    }

    //get all question of quizz
    @GetMapping("/quiz/{qid}")
    public ResponseEntity<?> getAllQuestionsOfQuiz(@PathVariable("qid") Long qid)
    {
    	
    	Quiz quiz=this.quizService.getQuizById(qid);
    	Set<Question> questions=quiz.getQuestions();
    	List list=new ArrayList(questions);
        int totalQuestions=Integer.parseInt(quiz.getNumberOfQuestions());
        
        if(list.size()>totalQuestions)
        {
            list=list.subList(0,totalQuestions+1);
        }
        Collections.shuffle(list);
        return ResponseEntity.ok(list);
    	
    	
    	
    	
    	
    }


  /*  @GetMapping("/quiz/all/{qid}")
    public ResponseEntity<?> getAllQuestionsOfQuizAdmin(@PathVariable("qid") Long qid)
    {
      Quiz quiz=new Quiz();
      quiz.setQid(qid);
      Set<Question>list=this.questionService.getAllQuestionOfQuiz(quiz);

        return ResponseEntity.ok(list);
    }
*/
    
    //get a single question
    @GetMapping("/{qid}")
    public Question getQuestion(@PathVariable("qid") Long qid)
    {
        return this.questionService.getQuestionById(qid);
    }
    //delete a single question
    @DeleteMapping("{qid}")
    public void deleteQuestion(@PathVariable("qid") Long qid)
    {
        this.questionService.deleteQuestionById(qid);
    }
}
