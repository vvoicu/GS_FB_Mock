package com.data.model.messages;

import com.tools.FieldGenerator;
import com.tools.FieldGenerator.Mode;

public class ParticipantsDetailsModel {

	public String name;
	public String id;
	public ParticipantsPictureModel picture;

	public ParticipantsDetailsModel() {
		setName();
		setId();
		setPicture();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setName() {
		this.name = FieldGenerator.generateRandomString(15, Mode.ALPHANUMERICSCHAR);
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

	public ParticipantsPictureModel getPicture() {
		return picture;
	}

	public void setPicture(ParticipantsPictureModel picture) {
		this.picture = picture;
	}

	public void setPicture() {
		this.picture = new ParticipantsPictureModel();
	}

}
