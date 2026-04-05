package com.microservices.Doctor.proxy;

import com.microservices.Doctor.dto.PatientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "PATIENT-SERVICE")
public interface PatientProxy {
    @GetMapping("/{id}")
    ResponseEntity<PatientDTO> getById(@PathVariable Long id);
    }