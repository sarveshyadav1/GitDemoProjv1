package com.example.demo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component("msgProducer")
public class MessageProducer {
	@Autowired
	private KafkaTemplate<String, String> template;
	 @Value("${app.topic.name}")
	private String topicName;
	 
	 public String msgProducer(String msg) {
		 
		 template.send(topicName,msg);
		 
		 return "Message Deliverd";
	 }
	 
	 

}
