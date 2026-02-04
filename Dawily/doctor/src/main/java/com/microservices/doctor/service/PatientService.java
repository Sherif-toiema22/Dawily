package com.microservices.Doctor.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PatientService {
    public String getPatient(String name){
        String fullUrl="http://localhost:9000/search/"+name;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                fullUrl, String.class);
    }
}
