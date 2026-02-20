package com.microservices.patient.mapper;

import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.model.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {

    public PatientDTO toDto(Patient patient) {
        PatientDTO dto = new PatientDTO();
        dto.setPatientId(patient.getId());
        dto.setPatientName(patient.getPatientName());
        dto.setPatientAge(patient.getPatientAge());
        return dto;
    }

    public Patient toEntity(PatientDTO dto) {
        Patient patient = new Patient();
        patient.setId(dto.getPatientId());
        patient.setPatientName(dto.getPatientName());
        patient.setPatientAge(dto.getPatientAge());
        return patient;
    }
    public void updatePatientFromDto(PatientDTO dto, Patient patient) {

        if (dto.getPatientName() != null) {
            patient.setPatientName(dto.getPatientName());
        }

        if (dto.getPatientAge() != null) {
            patient.setPatientAge(dto.getPatientAge());
        }
    }

}
