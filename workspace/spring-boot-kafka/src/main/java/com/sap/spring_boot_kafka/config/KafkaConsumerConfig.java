package com.sap.spring_boot_kafka.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@EnableKafka // required for @KafkaListener
@Configuration
public class KafkaConsumerConfig {
	
	@Value("${spring.kafka.consumer.bootstrap-servers}")
	private String CONSUME_BROKERS;
	
	
	@Bean
	public Consumer<String, Object> manualConsumer() {
		return consumerFactory("consumerGroupManual").createConsumer();
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Object> firstKafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Object> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory("consumerGroup1"));
		factory.setConcurrency(1);
		factory.setAutoStartup(true);
		return factory;
	} 
	
	
	private ConsumerFactory<String, Object> consumerFactory(String groupId) {
		Map<String, Object> props = new HashMap<>();
		
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, CONSUME_BROKERS);
		props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		JsonDeserializer<Object> jsonDeserializer = new JsonDeserializer<>();
		jsonDeserializer.addTrustedPackages("*");
		
		return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), jsonDeserializer);
	}

}
