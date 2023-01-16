package com.example.methodsecurity.service;

import com.example.methodsecurity.ds.Employee;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private Map<String , Employee> records =
            Map.of(
                    "john",
                    new Employee("John Doe",
                            List.of("Karamazov Brothers"),
                            List.of("accountant","reader")),
                    "mary",
                    new Employee("Mary Shelly",
                            List.of("Frankenstein"),
                            List.of("novelist")
                    )
            );

    @PostAuthorize("returnObject.roles.contains('novelist')")
    public Employee getBookDetails(String name){
        return records.get(name);
    }
}
