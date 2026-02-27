package com.microservices.Doctor.controller;


import com.microservices.Doctor.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    private final PatientService patientService;


    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/doctor/get-patient")
    public String getName(){
       return this.patientService.getPatient("Ahmed");

    }


}
