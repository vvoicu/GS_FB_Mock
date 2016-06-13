package com.data.model.messages;

import java.util.ArrayList;
import java.util.List;

import com.tools.FieldGenerator;
import com.tools.FieldGenerator.Mode;

public class MessageDetailsModel {

	public String message;
	public List<DataBasicModel> to;
	public DataBasicModel from;
	public String created_time;
	public String id;

	public MessageDetailsModel() {
		setMessage();
		setTo();
		setFrom();
		setCreated_time();
		setId();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setMessage() {
		this.message = FieldGenerator.generateRandomString(15, Mode.ALPHANUMERICSCHAR);
	}

	public List<DataBasicModel> getTo() {
		return to;
	}

	public void setTo(List<DataBasicModel> to) {
		this.to = to;
	}
	public void setTo() {
		this.to = new ArrayList<DataBasicModel>();
	}

	public DataBasicModel getFrom() {
		return from;
	}

	public void setFrom(DataBasicModel from) {
		this.from = from;
	}
	
	public void setFrom() {
		this.from = new DataBasicModel();
	}

	public String getCreated_time() {
		return created_time;
	}

	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}
	public void setCreated_time() {
		this.created_time = String.valueOf(System.nanoTime());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setId() {
		this.id = "m_mid." + FieldGenerator.generateRandomString(13, Mode.NUMERIC) + ":" + FieldGenerator.generateRandomString(18, Mode.ALPHANUMERIC);
	}

}
