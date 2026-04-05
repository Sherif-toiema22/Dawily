package com.microservices.Doctor.service;


import com.microservices.Doctor.dto.PatientDTO;
import com.microservices.Doctor.proxy.PatientProxy;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientProxy patientProxy;

    public PatientService(PatientProxy patientProxy) {
        this.patientProxy = patientProxy;
    }

    public PatientDTO getPatient(Long id) {
        return this.patientProxy.getById(id).getBody();
    }
}
