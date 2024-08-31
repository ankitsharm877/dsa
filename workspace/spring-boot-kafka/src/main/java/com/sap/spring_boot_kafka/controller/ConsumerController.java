package com.sap.spring_boot_kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sap.spring_boot_kafka.service.ManualConsumerService;

@RestController
@RequestMapping("api/consumer")
public class ConsumerController {

	@Value("${kafka.first-topic}")
	private String FIRST_TOPIC;

	@Autowired
	private ManualConsumerService manualConsumerService;
	
	@GetMapping("manual")
	public ResponseEntity<?> getMessagesManually(
			@RequestParam(value = "partition", required = false, defaultValue = "0") Integer partition,
			@RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset) {
		return ResponseEntity.ok(manualConsumerService.receivceMessages(FIRST_TOPIC, partition, offset));
	}
}
