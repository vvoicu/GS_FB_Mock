package com.connector;

import org.bson.Document;

import com.constants.MongoConstants;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnector {

	public static MongoClient mongoClient = new MongoClient(MongoConstants.MONGO_URL, MongoConstants.MONGO_PORT);
	public static MongoDatabase db = mongoClient.getDatabase(MongoConstants.MONGO_DB);
	public static void mongoDropColletion() {
		MongoCollection<Document> table = db.getCollection(MongoConstants.MONGO_PACKAGE_COLLECTION);
		table.drop();
	}

}
