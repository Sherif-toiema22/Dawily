package com.microservices.Doctor.proxy;

import com.microservices.Doctor.dto.PatientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "PATIENT-SERVICE")
public interface PatientProxy {
    @GetMapping("/get-patient/{id}")
    ResponseEntity<PatientDTO> getPatientById(@PathVariable Long id);

    @PostMapping("/add-patient")
    public ResponseEntity<PatientDTO> save (@RequestBody PatientDTO patientDTO);
}