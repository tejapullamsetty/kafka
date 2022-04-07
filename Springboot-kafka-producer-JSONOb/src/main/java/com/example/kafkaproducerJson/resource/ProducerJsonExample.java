package com.example.kafkaproducerJson.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaproducerJson.model.StudentDetails;

@RestController
@RequestMapping("/produce/json")
public class ProducerJsonExample {

	@Autowired
	KafkaTemplate<String, StudentDetails> kafkaTemplate;

	private static final String TOPICNAME = "Kafka_Prod_Example";

	@GetMapping("/{studentName}")
	public String jsonFormate(@PathVariable("studentName") String studentName) {

		kafkaTemplate.send(TOPICNAME, new StudentDetails(studentName, "1234", "27", "Hyderabad"));

		return "Successfully send json data";
	}

}
