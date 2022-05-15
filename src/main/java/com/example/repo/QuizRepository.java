package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Category;
import com.example.model.Quiz;


public interface QuizRepository extends JpaRepository<Quiz,Long> {
	public List<Quiz> findByCategory(Category cat);

}
