package com.microservices.patient.controller;

import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.service.PatientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PatientController {


    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        System.out.println("PatientController created. Service is: " +
                (patientService == null ? "NULL" : "INJECTED"));
        this.patientService = patientService;
    }

    @PostMapping("/add-patient")
    public ResponseEntity<PatientDTO> save (@RequestBody PatientDTO patientDTO){
        System.out.println(patientDTO.toString());
        return ResponseEntity.ok(patientService.save(patientDTO));
    }

    @GetMapping("/patients")
    public ResponseEntity<List<PatientDTO>> getAll() {
        return ResponseEntity.ok(patientService.getAll());
    }

    @GetMapping("/get-patient/{id}")
    public ResponseEntity<PatientDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(patientService.getById(id));
    }

    @PutMapping("/update-patient/{id}")
    public ResponseEntity<PatientDTO> update(
            @PathVariable Long id,
            @RequestBody PatientDTO dto) {
        return ResponseEntity.ok(patientService.update(id, dto));
    }

    @DeleteMapping("/delete-patient/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        patientService.delete(id);
        return ResponseEntity.noContent().build();
    }



}
