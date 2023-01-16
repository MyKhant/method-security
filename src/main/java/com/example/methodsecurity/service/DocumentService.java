package com.example.methodsecurity.service;

import com.example.methodsecurity.ds.Document;
import com.example.methodsecurity.repo.DocumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepo documentRepo;

    @PostAuthorize("hasPermission(returnObject,'read')")
    public Document getDocument(String code){
        return documentRepo.findDocument(code);
    }
}
