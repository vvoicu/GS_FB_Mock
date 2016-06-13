package com.data.model.messages;

import com.tools.FieldGenerator;
import com.tools.FieldGenerator.Mode;

public class DataBasicModel {

	public String name;
	public String email;
	public String id;
	
	public DataBasicModel(){
		setName();
		setId();
		setEmail();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName() {
		name = FieldGenerator.generateRandomString(15, Mode.ALPHANUMERICSCHAR);
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setEmail() {
		this.email = this.id +  "\\" + FieldGenerator.generateRandomString(5, Mode.ALPHANUMERIC) + "facebook.com";
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setId() {
		this.id = FieldGenerator.generateRandomString(15, Mode.NUMERIC);
	}

}
