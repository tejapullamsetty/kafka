package com.example.kafkaconsumerexamp.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerExample {
	
	@KafkaListener(topics="Kafka_Prod_Example", groupId ="group_id")
	public void kafkaConsumeExample(String message) {
		
		System.out.println("Consume the date from kafka server is"+" "+message);
		
	}

}
