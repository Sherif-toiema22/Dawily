package com.microservices.patient.controller;

import com.microservices.patient.model.entity.Patient;
import com.microservices.patient.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PatientController {

    @Autowired
    private PatientService patientService;


    @PostMapping("/add-patient")
    public Patient save (@RequestBody Patient patient){
        System.out.println(patient);
        return patientService.save(patient);
    }
    @PutMapping ("/update-patient")
    public Patient update (@RequestBody Patient patient){
        return this.patientService.update(patient);
    }



}
