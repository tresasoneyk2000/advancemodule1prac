package com.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.repository.Repo;

@RestController
@RequestMapping("stud")
public class Controller {
	
	@Autowired
	Repo repo;
	
	@GetMapping("{id}")
	public ResponseEntity<Student> getproducts( @PathVariable long id){
		
		Optional<Student> op= repo.findById(id);
		Student s= op.get();
		return ResponseEntity.ok().body(s);
		
	}
	
	@PostMapping("/save")
	
	
	public ResponseEntity<Student> save( @RequestBody Student stud){
		return ResponseEntity.ok().body(repo.save(stud));
	}
	

}
