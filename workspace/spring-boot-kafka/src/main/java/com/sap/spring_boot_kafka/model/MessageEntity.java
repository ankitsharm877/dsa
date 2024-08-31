package com.sap.spring_boot_kafka.model;

import java.time.LocalDateTime;

public class MessageEntity {

	private String type;
	private LocalDateTime time;
	
	public MessageEntity() {

	}

	public MessageEntity(String type, LocalDateTime time) {
		this.type = type;
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "MessageEntity [type=" + type + ", time=" + time + "]";
	}
}
