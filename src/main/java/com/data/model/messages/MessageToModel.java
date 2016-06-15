package com.data.model.messages;

import java.util.ArrayList;
import java.util.List;

public class MessageToModel {
	
	
	public List<DataBasicModel> data;
	
	public MessageToModel(){
		setData();
	}

	public List<DataBasicModel> getData() {
		return data;
	}

	public void setData(List<DataBasicModel> data) {
		this.data = data;
	}
	public void setData() {
		this.data = new ArrayList<DataBasicModel>();
		data.add(new DataBasicModel());
	}

	

}
