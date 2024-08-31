package com.sap.spring_boot_kafka.controller;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.spring_boot_kafka.model.MessageEntity;

@RestController
@RequestMapping("api/producer")
public class ProducerController {

	@Value("${kafka.first-topic}")
	private String FIRST_TOPIC;
	
	@Value("${kafka.second-topic}")
	private String SECOND_TOPIC;
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaProducerTemplate;
	
	Logger logger = LoggerFactory.getLogger(ProducerController.class);
	
	@GetMapping("/send")
	public ResponseEntity<?> sendMessage() throws InterruptedException, ExecutionException {
		MessageEntity messageEntity = new MessageEntity("default", LocalDateTime.now());
		
		CompletableFuture<SendResult<String, Object>> future = kafkaProducerTemplate.send(FIRST_TOPIC, messageEntity);
		
		SendResult<String, Object> result = future.get();
		
		logger.info("Send message with offset: {}, partition: {}", result.getRecordMetadata().offset(), result.getRecordMetadata().partition());
		
		return ResponseEntity.ok(messageEntity);
	}
	
	@GetMapping("/sendWithKey/{key}")
	public ResponseEntity<?> sendMessage(@PathVariable String key) throws InterruptedException, ExecutionException {
		MessageEntity messageEntity = new MessageEntity("record-key", LocalDateTime.now());
		
		CompletableFuture<SendResult<String, Object>> future = kafkaProducerTemplate.send(SECOND_TOPIC, key, messageEntity);
		
		SendResult<String, Object> result = future.get();
		
		logger.info("Send message with offset: {}, partition: {}", result.getRecordMetadata().offset(), result.getRecordMetadata().partition());
		
		return ResponseEntity.ok(messageEntity);
	}
}
