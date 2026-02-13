package com.microservices.patient.service;

//import com.microservices.patient.model.dto.AddPatientDTO;
import com.microservices.patient.model.entity.Patient;

import com.microservices.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService {

    @Autowired
    private  PatientRepository patientRepository;

//    private final List<String> names= Arrays.asList("Ahmed","Abd","khaled");

//    public String getName(String name){
//        return names.stream().filter(n -> n.equals(name))
//                .findAny().orElse("No patient found!");
//    }

//    public AddPatientDTO save (AddPatientDTO dto){
//        Patient entity = Patient.builder()
//                .patientName(dto.getPatientName())
//                .patientAge(dto.getPatientAge()).
//                build();
//        Patient patient = this.patientRepository.save(entity);
//
//        return AddPatientDTO.builder()
//                .patientName(patient.getPatientName())
//                .patientAge(patient.getPatientAge())
//                .build();
//    }
    public Patient save (Patient p1){
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
