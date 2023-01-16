package com.example.methodsecurity.controller;

import com.example.methodsecurity.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {



    @Autowired
    private NameService nameService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello, " + nameService.getName();
    }

    @GetMapping("/secret/name/{name}")
    public List<String> names(@PathVariable String name){
        return nameService.getSecreteName(name);
    }
}
