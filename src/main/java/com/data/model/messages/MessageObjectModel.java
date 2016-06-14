package com.data.model.messages;

import com.tools.FieldGenerator;
import com.tools.FieldGenerator.Mode;

public class MessageObjectModel {

	public String message_count;
	public String updated_time;
	public String id;
	public MessageModel messages;
	public ParticipantsModel participants;
	
	public MessageObjectModel(){
		setMessage_count();
		setUpdated_time();
		setId();
		setMessages();
		setParticipants();
	}
	
	public String getMessage_count() {
		return message_count;
	}
	public void setMessage_count(String message_count) {
		this.message_count = message_count;
	}
	public void setMessage_count() {
		this.message_count = FieldGenerator.generateRandomString(2, Mode.NUMERIC);;
	}
	
	public String getUpdated_time() {
		return updated_time;
	}
	public void setUpdated_time(String updated_time) {
		this.updated_time = updated_time;
	}
	public void setUpdated_time() {
		this.updated_time = String.valueOf(System.nanoTime());
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setId() {
		this.id = "t_mid." + FieldGenerator.generateRandomString(13, Mode.NUMERIC) + ":" + FieldGenerator.generateRandomString(18, Mode.ALPHANUMERIC);
	}
	
	public MessageModel getMessages() {
		return messages;
	}
	public void setMessages(MessageModel messages) {
		this.messages = messages;
	}
	public void setMessages() {
		this.messages = new MessageModel();
	}
	
	
	public ParticipantsModel getParticipants() {
		return participants;
	}
	public void setParticipants(ParticipantsModel participants) {
		this.participants = participants;
	}
	public void setParticipants() {
		this.participants = new ParticipantsModel();
	}
	
}
