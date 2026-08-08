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
        return this.patientProxy.getPatientById(id).getBody();
    }

    public PatientDTO save(PatientDTO patientDTO) {
        return this.patientProxy.save(patientDTO).getBody();
    }
}
