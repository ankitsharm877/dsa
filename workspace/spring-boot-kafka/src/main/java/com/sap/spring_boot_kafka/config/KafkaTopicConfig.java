package com.sap.spring_boot_kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;

import jakarta.annotation.PostConstruct;

@Configuration
public class KafkaTopicConfig {

	@Value("${kafka.first-topic}")
	private String FIRST_TOPIC;
	
	@Value("${kafka.second-topic}")
	private String SECOND_TOPIC;
	
	@Autowired
	private KafkaAdmin kafkaAdmin;
	
	private NewTopic firstTopic() {
		return TopicBuilder.name(FIRST_TOPIC)
				.partitions(2)
				.replicas(2) // cannot be larger than aviable brokers
				.config(TopicConfig.RETENTION_MS_CONFIG, "100000000")
				.build();
	}
	
	private NewTopic secondTopic() {
		return TopicBuilder.name(FIRST_TOPIC)
				.partitions(3)
				.replicas(2) // cannot be larger than aviable brokers
				.build();
	}
	
	@PostConstruct
	public void init() {
		kafkaAdmin.createOrModifyTopics(firstTopic());
		kafkaAdmin.createOrModifyTopics(secondTopic());
	}
	
}
