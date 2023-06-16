package com.rabbitmq.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.model.OrderStatus;

@RestController
@RequestMapping("/order")
public class Producer {
	@Autowired
	RabbitTemplate template;
	
	@Value("${rabbitmq.exchange}")
	String exchange;
	@Value("${rabbitmq.routingkey}")
	String routingkey;
	@Value("${rabbitmq.queue}")
	String queueName;
	
	
	@PostMapping("/{custname}")
	
	public String methodcalling(@RequestBody OrderStatus order, @PathVariable String custname) {
		
		template.convertAndSend(exchange,routingkey,order);
		return "sucees";
		
	} 

}
