package com.example.methodsecurity.repo;

import com.example.methodsecurity.ds.Document;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class DocumentRepo {
    private Map<String, Document> documents =
            Map.of("abc123",new Document("john"),
                    "qwe123",new Document("mary"),
                    "ads123",new Document("thomas"));

    public Document findDocument(String code) {
       return documents.get(code);
    }

}
