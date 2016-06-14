package com.data.model.messages;

public class ParticipantsPictureDataModel {
	
	public String is_silhouette;
	public String url;
	
	public ParticipantsPictureDataModel(){
		setIs_silhouette();
		setUrl();
	}
	
	public String getIs_silhouette() {
		return is_silhouette;
	}
	public void setIs_silhouette(String is_silhouette) {
		this.is_silhouette = is_silhouette;
	}
	public void setIs_silhouette() {
		this.is_silhouette = String.valueOf(Math.random() < 0.5);
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUrl() {
		this.url = "https://scontent.xx.fbcdn.net/v/t1.0-1/c15.0.50.50/p50x50/10354686_10150004552801856_220367501106153455_n.jpg?oh=f2a67d28b2c5825839d0bf36c6194d65&oe=57FC792F";
	}

}
