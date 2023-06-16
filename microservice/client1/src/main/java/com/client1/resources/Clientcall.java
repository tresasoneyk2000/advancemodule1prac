package com.client1.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("rest/client")
public class Clientcall {
	@Autowired
	RestTemplate template;
	@GetMapping
	public String calling() {
		String url="http://localhost:8093/rest/welcome";
		String output=template.getForObject(url, String.class);
		return output;
		
		
	}

}
