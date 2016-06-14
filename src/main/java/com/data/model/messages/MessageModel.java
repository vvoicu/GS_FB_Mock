package com.data.model.messages;

import java.util.ArrayList;
import java.util.List;

public class MessageModel {

//	public List<MessageDetailsModel> data;
//	public PagingModel paging;
//
//	public MessageModel(){
//		setData();
//		setPaging();
//	}
//	
//	public List<MessageDetailsModel> getData() {
//		return data;
//	}
//	public void setData(List<MessageDetailsModel> data) {
//		this.data = data;
//	}
//	public void setData() {
//		this.data = new ArrayList<MessageDetailsModel>();
//	}
//
//	public PagingModel getPaging() {
//		return paging;
//	}
//	public void setPaging(PagingModel paging) {
//		this.paging = paging;
//	}
//	public void setPaging() {
//		this.paging = new PagingModel();
//	}

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
