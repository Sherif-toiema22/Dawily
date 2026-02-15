package com.microservices.patient.service;

//import com.microservices.patient.model.dto.AddPatientDTO;
import com.microservices.patient.mapper.PatientMapper;
import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.model.entity.Patient;

import com.microservices.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    @Autowired
    public PatientService(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    public Patient save (PatientDTO dto){
        return patientRepository.save (p1);
    }
    @Transactional
    public Patient update (Patient newData ){
        Patient patient=patientRepository.findById(newData.getId())
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        patient.setPatientName(newData.getPatientName());
        patient.setPatientAge(newData.getPatientAge());


        return patient;
    }
}
