package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.consumer.MessageStore;
import com.example.demo.producer.MessageProducer;

@RestController
public class KafkaMessagingHandalingContrller {

	@Autowired
	private MessageProducer msgProduce;
	@Autowired
	private MessageStore store;
	
	@GetMapping("/send")
	public String sendMassage(@RequestParam("message")String  message) {
		String status=msgProduce.msgProducer(message);
		return "<h1>"+status+"</h1>";
	
	}
	
	@GetMapping("/readAll")
	public String FetchAllMessage() {
		return store.getAllMessage();
		
		
	}
	
}
