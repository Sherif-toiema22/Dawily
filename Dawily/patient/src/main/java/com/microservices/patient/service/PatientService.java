package com.microservices.patient.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PatientService {
    private List<String> names= Arrays.asList("Ahmed","Abd","khaled");

    public String getName(String name){
        return names.stream().filter(n -> n.equals(name))
                .findAny().orElse("Not patient found!");
    }
}
