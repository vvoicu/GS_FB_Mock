package com.data.model.messages;

public class MessageToModel {
	
	public MessageToModel(){
		setData();
	}
	
	public DataBasicModel data;

	public DataBasicModel getData() {
		return data;
	}
	public void setData(DataBasicModel data) {
		this.data = data;
	}
	public void setData() {
		this.data = new DataBasicModel();
	}
	

}
