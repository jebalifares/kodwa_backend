package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Reference;
import com.example.service.ReferenceService;

@RestController
@RequestMapping("api/reference")
@CrossOrigin("*")
public class ReferenceController {

	@Autowired
	private ReferenceService referenceService;
	
	@PostMapping("/")
	public ResponseEntity<?> addRefernce(@RequestBody Reference ref){
		return ResponseEntity.ok(this.referenceService.addReference(ref));
	}
}
