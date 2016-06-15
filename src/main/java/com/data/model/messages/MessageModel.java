package com.data.model.messages;

public class MessageModel {


	public MessageDetailsModel data;
	public PagingModel paging;

	public MessageModel(){
		setData();
		setPaging();
	}
	
	public MessageDetailsModel getData() {
		return data;
	}
	public void setData(MessageDetailsModel data) {
		this.data = data;
	}
	public void setData() {
		this.data = new MessageDetailsModel();
	}

	public PagingModel getPaging() {
		return paging;
	}
	public void setPaging(PagingModel paging) {
		this.paging = paging;
	}
	public void setPaging() {
		this.paging = new PagingModel();
	}
	

}
