package com.data.model.messages;

import java.util.ArrayList;
import java.util.List;

public class MessageModel {

	public List<MessageDetailsModel> data;
	public PagingModel paging;

	public MessageModel(){
		setData();
	}
	
	public List<MessageDetailsModel> getData() {
		return data;
	}

	public void setData(List<MessageDetailsModel> data) {
		this.data = data;
	}
	
	public void setData() {
		this.data = new ArrayList<MessageDetailsModel>();
	}

}
