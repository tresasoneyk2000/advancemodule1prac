package com.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.feignclient.model.Student;

@FeignClient(value="feignclient",url = "http://localhost:8090/stud")

public interface feignclientinterface {
	@RequestMapping(method= RequestMethod.GET, value= "{id}", produces="application/json")
	public Student getProductById(@PathVariable ("id") int id);
	
	@RequestMapping(method= RequestMethod.POST, value= "{id}", produces="application/json")
	public Student getProductById(@PathVariable ("id") int id);
	
	
}
