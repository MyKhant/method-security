package com.example.methodsecurity.controller;


import com.example.methodsecurity.ds.Document;
import com.example.methodsecurity.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping("/document/{code}")
    public Document getDetails(@PathVariable String code){
        return documentService.getDocument(code);
    }
}
