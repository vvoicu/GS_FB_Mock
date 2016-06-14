package com.connector;

import org.bson.Document;

import com.convertor.ModelToDocumentConvertor;
import com.data.model.messages.MessageObjectModel;
import com.mongodb.client.MongoCollection;

public class MongoWrite extends MongoConnector {

	public static void writePackageObjectModel(MessageObjectModel messageObjectModel) {
		MongoCollection<Document> table = db.getCollection(com.constants.MongoConstants.MONGO_PACKAGE_COLLECTION);
		table.insertOne(ModelToDocumentConvertor.convertMessageObjectModelToDocument(messageObjectModel));
	}
}
