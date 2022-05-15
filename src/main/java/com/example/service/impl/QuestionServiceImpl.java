package com.example.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Question;
import com.example.repo.QuestionRepository;
import com.example.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Question UpdateQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.questionRepository.save(question);
	}

	@Override
	public Set<Question> getQuestion() {
		// TODO Auto-generated method stub
		return new HashSet(this.questionRepository.findAll());
	}

	@Override
	public Question getQuestionById(Long qid) {
		// TODO Auto-generated method stub
		return this.questionRepository.findById(qid).get();
	}

	@Override
	public void deleteQuestionById(Long qid) {
		// TODO Auto-generated method stub
		this.questionRepository.deleteById(qid);
	}

	@Override
	public Set<Question> getAllQuestionOfQuiz(Long qid) {
		// TODO Auto-generated method stub
		return null;
	}

}
