package com.microservices.patient.mapper;

import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.model.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientMapper PATIENT_MAPPER = Mappers.getMapper(PatientMapper.class);

    PatientDTO patientToPatientDTO(Patient patient);
    Patient patientDTOtoPatient(PatientDTO patientDTO);

}
