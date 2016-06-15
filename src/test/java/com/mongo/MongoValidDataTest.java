package com.mongo;

import org.junit.Test;

import com.connector.MongoConnector;
import com.connector.MongoWrite;
import com.data.model.messages.DataBasicModel;
import com.data.model.messages.MessageObjectModel;

public class MongoValidDataTest {

	@Test
	public void dataPopulation() {
		MongoConnector.mongoDropColletion();
		MessageObjectModel messageObjectModel;
		for (int i = 0; i < 10; i++) {
			messageObjectModel = new MessageObjectModel();
			
//			messageObjectModel.messages.data.to.data.add(new DataBasicModel());
////			messageObjectModel.messages.data.to.data.add(new DataBasicModel().setEmail("myEmail@nothing"));
//			messageObjectModel.messages.data.to.data.add(new DataBasicModel());
			
			MongoWrite.writePackageObjectModel(messageObjectModel);
		}
	}

}
