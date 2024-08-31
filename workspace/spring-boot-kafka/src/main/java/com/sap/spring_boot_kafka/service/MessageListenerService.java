package com.sap.spring_boot_kafka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.sap.spring_boot_kafka.model.MessageEntity;

@Service
public class MessageListenerService {
	
	Logger logger = LoggerFactory.getLogger(MessageListenerService.class);

	@KafkaListener(topics = "${kafka.first-topic}", containerFactory = "firstKafkaListenerContainerFactory")
	public void listenFirstTopic1(Object record) {
		logger.info("Received1 message in group1: {}", record);
	}
	
	@KafkaListener(topics = "${kafka.first-topic}", groupId = "consumerGroup2" ,containerFactory = "firstKafkaListenerContainerFactory")
	public void listenFirstTopic2(Object record) {
		logger.info("Received2 message in group1: {}", record);
	}
	
	@KafkaListener(topics = "${kafka.first-topic}", groupId = "consumerGroup3" ,containerFactory = "firstKafkaListenerContainerFactory")
	public void listenFirstTopicWithDetails(ConsumerRecord<String, MessageEntity> consumerRecord,
				@Payload MessageEntity messageEntity,
				@Header(KafkaHeaders.GROUP_ID) String groupId,
				@Header(KafkaHeaders.OFFSET) int offset,
				@Header(KafkaHeaders.RECEIVED_PARTITION) int partition) {
		logger.info("---------------Received Message----------------");
		logger.info("Record: {}", consumerRecord);
		logger.info("Message: {}", messageEntity);
		logger.info("GroupId: {}", groupId);
		logger.info("Offset: {}", offset);
		logger.info("Partition: {}", partition);
	}
	
	@KafkaListener(topics = "${kafka.first-topic}", groupId = "consumerGroup4" ,containerFactory = "firstKafkaListenerContainerFactory",
			topicPartitions = {@TopicPartition(topic = "${kafka.first-topic}", 
			partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))})
	public void listenFirstTopicFromBeginning(Object record) {
		logger.info("Received message from beginning in consumerGroup4: {}", record);
	}
}
