package com.example.kafkaproducer.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerExample {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	private static final String TOPICNAME="Kafka_Prod_Example";
	
	@GetMapping("/{message}")
	public String producerExample(@PathVariable("message") String message) {
		kafkaTemplate.send(TOPICNAME,message);
		
		return "Successfully Produce the message";
	}

}
