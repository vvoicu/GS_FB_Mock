package com.data.model.messages;

import java.util.ArrayList;
import java.util.List;

public class ParticipantsModel {
	
//	public List<ParticipantsDetailsModel> data;
	public ParticipantsDetailsModel data;
	public ParticipantsPagingModel paging;
	
	public ParticipantsModel(){
		setData();
		setPaging();
	}
	
	
//	public List<ParticipantsDetailsModel> getData() {
//		return data;
//	}
//	public void setData(List<ParticipantsDetailsModel> data) {
//		this.data = data;
//	}
//	public void setData(){
//		this.data = new ArrayList<ParticipantsDetailsModel>();
//	}
	public ParticipantsDetailsModel getData() {
		return data;
	}
	public void setData(ParticipantsDetailsModel data) {
		this.data = data;
	}
	public void setData(){
		this.data = new ParticipantsDetailsModel();
	}
	
	public ParticipantsPagingModel getPaging() {
		return paging;
	}
	public void setPaging(ParticipantsPagingModel paging) {
		this.paging = paging;
	}
	public void setPaging() {
		this.paging =  new ParticipantsPagingModel();
	}
	

}
