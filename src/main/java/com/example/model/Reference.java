package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Reference {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long RefId;
	
	private String savoir_etre;
	
	private String savoir_faire;
	
	private String savoir_todo;
	
	@OneToOne(fetch=FetchType.EAGER)
	private Category category ;
	
	
	public Reference() {
		
	}


	public Reference(String savoir_etre, String savoir_faire, String savoir_todo) {
		super();
		this.savoir_etre = savoir_etre;
		this.savoir_faire = savoir_faire;
		this.savoir_todo = savoir_todo;
	}


	public Long getRefId() {
		return RefId;
	}


	public void setRefId(Long refId) {
		RefId = refId;
	}


	public String getSavoir_etre() {
		return savoir_etre;
	}


	public void setSavoir_etre(String savoir_etre) {
		this.savoir_etre = savoir_etre;
	}


	public String getSavoir_faire() {
		return savoir_faire;
	}


	public void setSavoir_faire(String savoir_faire) {
		this.savoir_faire = savoir_faire;
	}


	public String getSavoir_todo() {
		return savoir_todo;
	}


	public void setSavoir_todo(String savoir_todo) {
		this.savoir_todo = savoir_todo;
	}
	
	
	
	
	
}