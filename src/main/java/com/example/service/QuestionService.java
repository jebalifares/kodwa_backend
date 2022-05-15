package com.example.service;

import java.util.Set;

import com.example.model.Question;

public interface QuestionService {
	
	// add question
	public Question addQuestion(Question question);
	
	//update question
	public Question UpdateQuestion(Question question);
	 
	//get question
	
	public Set<Question> getQuestion();
	// get question by id
	
	public Question getQuestionById(Long qid);
	
	// delete 
	public void deleteQuestionById(Long qid );
	
	//get all question of quiz
	
	public Set<Question> getAllQuestionOfQuiz(Long qid);

}
