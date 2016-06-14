package com.convertor;

import java.util.List;

import org.bson.Document;

import com.data.model.messages.DataBasicModel;
import com.data.model.messages.MessageDetailsModel;
import com.data.model.messages.MessageModel;
import com.data.model.messages.MessageObjectModel;
import com.data.model.messages.MessageToModel;
import com.data.model.messages.PagingModel;
import com.data.model.messages.ParticipantsDetailsModel;
import com.data.model.messages.ParticipantsModel;
import com.data.model.messages.ParticipantsPagingModel;
import com.data.model.messages.ParticipantsPictureDataModel;
import com.data.model.messages.ParticipantsPictureModel;
import com.tools.ModelKeys;

public class ModelToDocumentConvertor {

	public static Document convertMessageObjectModelToDocument(MessageObjectModel messageObjectModel) {
		Document result = new Document();
		result.put(ModelKeys.count, messageObjectModel.getMessage_count());
		result.put(ModelKeys.updateTime, messageObjectModel.getUpdated_time());
		result.put(ModelKeys.id, messageObjectModel.getId());
		result.put(ModelKeys.messages, convertMessageModelToDocument(messageObjectModel.getMessages()));
		result.put(ModelKeys.participants, convertParticipantsModelToDocument(messageObjectModel.getParticipants()));
		return result;
	}

	public static Document convertMessageModelToDocument(MessageModel messageModel) {
		Document result = new Document();
		result.put(ModelKeys.messagesData, convertMessageDetailsModelToDocument(messageModel.getData()));
		result.put(ModelKeys.messagesPaging, convertPagingModelToDocument(messageModel.getPaging()));

		return result;
	}

	public static Document convertMessageDetailsModelToDocument(MessageDetailsModel messageDetailsModel) {
		Document result = new Document();
		result.put(ModelKeys.messagesDataMessage, messageDetailsModel.getMessage());
		result.put(ModelKeys.messagesDataTo, convertMessageToModel(messageDetailsModel.getTo()));
		result.put(ModelKeys.messagesDataFrom, convertDataBasicModel(messageDetailsModel.getFrom()));
		result.put(ModelKeys.messagesDataCreatedTime, messageDetailsModel.getCreated_time());
		result.put(ModelKeys.messagesDataId, messageDetailsModel.getId());
		
		return result;
	}

	public static Document convertMessageToModel(MessageToModel messageToModel) {
		Document result = new Document();
		result.put(ModelKeys.messagesDataToData, convertDataBasicModel(messageToModel.getData()));
		return result;
	}

	public static Document convertDataBasicModel(DataBasicModel dataBasicModel) {
		Document result = new Document();
		result.put(ModelKeys.messagesDataToDataName, dataBasicModel.getName());
		result.put(ModelKeys.messagesDataToDataEmail, dataBasicModel.getEmail());
		result.put(ModelKeys.messagesDataToDataId, dataBasicModel.getId());
		return result;
	}
	
	public static Document convertPagingModelToDocument(PagingModel pagingModel){
		Document result = new Document();
		result.put(ModelKeys.messagesPagingPrevious, pagingModel.getPrevious());
		result.put(ModelKeys.messagesPagingNext, pagingModel.getNext());
		return result;
		
	}
	
	public static Document convertParticipantsModelToDocument(ParticipantsModel participantsModel) {
		Document result = new Document();
		result.put(ModelKeys.participantsData, convertParticipantsDetailsModel(participantsModel.getData()));
		result.put(ModelKeys.participantsPaging, convertParticipantsPagingModel(participantsModel.getPaging()));
		return result;
	}

	public static Document convertParticipantsDetailsModel(ParticipantsDetailsModel participantsDetailsModel) {
		Document result = new Document();
		result.put(ModelKeys.participantsDataName, participantsDetailsModel.getName());
		result.put(ModelKeys.participantsDataId, participantsDetailsModel.getId());
		result.put(ModelKeys.participantsDataPicture, convertParticipantsPictureModel(participantsDetailsModel.getPicture()));

		return result;
	}

	public static Document convertParticipantsPictureModel(ParticipantsPictureModel participantsPictureModel) {
		Document result = new Document();
		result.put(ModelKeys.participantsDataPictureData, convertParticipantsPictureDataModel(participantsPictureModel.getData()));

		return result;
	}

	public static Document convertParticipantsPictureDataModel(ParticipantsPictureDataModel participantsPictureDataModel) {
		Document result = new Document();
		result.put(ModelKeys.participantsDataPictureDataIsSilhouette, participantsPictureDataModel.getIs_silhouette());
		result.put(ModelKeys.participantsDataPictureDataUrl, participantsPictureDataModel.getUrl());

		return result;
	}
	
	public static Document convertParticipantsPagingModel(ParticipantsPagingModel participantsPagingModel) {
		Document result = new Document();
		result.put(ModelKeys.participantsPagingNext, participantsPagingModel.getNext());
		
		return result;
	}




}