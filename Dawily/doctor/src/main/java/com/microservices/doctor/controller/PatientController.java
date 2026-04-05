package com.microservices.Doctor.controller;


import com.microservices.Doctor.dto.PatientDTO;
import com.microservices.Doctor.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class PatientController {
    private final PatientService patientService;


    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("get-patient")
    public PatientDTO getName(@RequestParam Long id){
       return this.patientService.getPatient(id);

    }


}
