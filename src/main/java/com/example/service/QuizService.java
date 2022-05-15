package com.example.service;

import java.util.List;
import java.util.Set;

import com.example.model.Category;
import com.example.model.Quiz;

public interface QuizService {
	
    public Quiz addQuiz(Quiz quiz);
	
	public Quiz UpdateQuiz(Quiz quiz);
	//get category
	public Set<Quiz> getQuizes();
	// get category by id
	public Quiz getQuizById(Long QuizId);
	// delete category
	public void deleteQuizById(Long QuizId);

	public List<Quiz> getQuizzesOfCategory(Category cat);

}
