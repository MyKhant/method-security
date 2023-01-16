package com.example.methodsecurity.controller;

import com.example.methodsecurity.service.BookService;
import com.example.methodsecurity.ds.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/details/{name}")
    public Employee getDetails(@PathVariable String name){
        return bookService.getBookDetails(name);
    }
}
