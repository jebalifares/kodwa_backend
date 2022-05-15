package com.example.service;

import java.util.Set;

import com.example.model.Category;

public interface CategoryService {
	//ajouter category
	public Category addCategory(Category category);
	
	public Category UpdateCategory(Category category);
	//get category
	public Set<Category> getCategories();
	// get category by id
	public Category getCategoryById(Long categoryId);
	// delete category
	public void deleteCategoryById(Long categoryId);

}
