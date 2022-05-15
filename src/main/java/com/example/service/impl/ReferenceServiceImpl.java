package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.Reference;
import com.example.repo.ReferenceRepository;
import com.example.service.ReferenceService;

@Service
public class ReferenceServiceImpl implements ReferenceService {
	
    @Autowired
	private ReferenceRepository referenceRepsitory;
	@Override
	public Reference addReference(Reference reference) {
		// TODO Auto-generated method stub
		return this.referenceRepsitory.save(reference);
	}
	
	

}
