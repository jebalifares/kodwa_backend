package com.example.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cid;
	private String title;
	private String description;
	
	@OneToOne
	private Reference reference;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER , mappedBy="category")
	@JsonIgnore
    private Set<Quiz> quizess=new LinkedHashSet<>();
	public Category() {
		
	}
	public Category(String title, String description) {
		
		this.title = title;
		this.description = description;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
