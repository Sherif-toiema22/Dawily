package com.microservices.Doctor.controller;


import com.microservices.Doctor.dto.PatientDTO;
import com.microservices.Doctor.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class PatientController {
    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/get-patient/{id}")
    public PatientDTO getPatient(@PathVariable Long id){
       return this.patientService.getPatient(id);

    }

    @PostMapping("/add-patient")
    public ResponseEntity<PatientDTO> save (@RequestBody PatientDTO patientDTO){
        System.out.println(patientDTO.toString());
        return ResponseEntity.ok(patientService.save(patientDTO));
    }

}
