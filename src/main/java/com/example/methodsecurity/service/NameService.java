package com.example.methodsecurity.service;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NameService {

    private Map<String, List<String>> secretNames = Map.of("john",List.of("Eergico","Perfecto"),"mary", List.of("Fantistico"));
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//    @Secured("ROLE_USER")
    @RolesAllowed("ADMIN")
    public String getName(){
        return "Luke Skywalker...";
    }
    @PreAuthorize("#name == authentication.principal.username")
    public List<String> getSecreteName(String name) {
        return secretNames.get(name);
    }
}
