package com.lakshmanan.TrelloCloneBackend.repository;

import com.mongodb.MongoClient;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

public class MongoRepository {

    private static String COLLECTION_NAME = "Boards";
    private static String DB_NAME = "TrelloClone";

    //@Autowired
    MongoClient mongoClient = new MongoClient("localhost", 27017);

    public void insertOneDocument(Document document){
        mongoClient.getDatabase(DB_NAME).getCollection(COLLECTION_NAME).insertOne(document);
    }

}
