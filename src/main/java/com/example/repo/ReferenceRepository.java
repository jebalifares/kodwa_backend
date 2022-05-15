package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Reference;

public interface ReferenceRepository extends JpaRepository<Reference,Long> {

}
