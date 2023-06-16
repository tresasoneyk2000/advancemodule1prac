package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rabbitmq.model.OrderStatus;
@Component
public class Consumer {
	@Value("${rabbitmq.exchange}")
	String exchange;
	@Value("${rabbitmq.routingkey}")
	String routingkey;
	@Value("${rabbitmq.queue}")
	String queueName;
	
	
	@RabbitListener(queues="ust_queue")
	
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("message received from que:"+orderStatus);
	}
	

}
