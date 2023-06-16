package com.feignclient.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignclient.feignclientinterface;
import com.feignclient.model.Student;


@RestController
@RequestMapping("feign")
public class Controllerfeign {
	
	@Autowired
	feignclientinterface feigninter;
	@PostMapping("/savestudent")
	
	public ResponseEntity<Student> save( @RequestBody Student stud){
		return 	
	}
	
	
public ResponseEntity<Student> getproducts( @PathVariable long id){
		
		Optional<Student> op= repo.findById(id);
		Student s= op.get();
		return ResponseEntity.ok().body(s);
		
	}
	
	
	
	
	
	

}
