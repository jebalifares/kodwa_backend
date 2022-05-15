package com.example.service.impl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Category;
import com.example.model.Quiz;
import com.example.repo.QuizRepository;
import com.example.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService {
	
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepository.save(quiz);
	}

	@Override
	public Quiz UpdateQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.quizRepository.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizes() {
		// TODO Auto-generated method stub
		return new HashSet(this.quizRepository.findAll());
	}

	@Override
	public Quiz getQuizById(Long QuizId) {
		// TODO Auto-generated method stub
		return this.quizRepository.findById(QuizId).get();
	}

	@Override
	public void deleteQuizById(Long QuizId) {
		// TODO Auto-generated method stub
		/*Quiz quiz=new Quiz();
        quiz.setqId(QuizId);
		this.quizRepository.delete(quiz);
		*/
		 this.quizRepository.deleteById(QuizId);
	}

	@Override
	public List<Quiz> getQuizzesOfCategory(Category cat) {
		// TODO Auto-generated method stub
		return this.quizRepository.findByCategory(cat);
	}
	
	

}
