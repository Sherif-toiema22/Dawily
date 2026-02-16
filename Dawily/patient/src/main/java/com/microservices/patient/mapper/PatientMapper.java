package com.microservices.patient.mapper;

import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.model.entity.Patient;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    @Mapping(target = "password", ignore = true)
    PatientDTO patientToPatientDTO(Patient patient);
    Patient patientDTOtoPatient(PatientDTO patientDTO);

    @BeanMapping(nullValuePropertyMappingStrategy =
            NullValuePropertyMappingStrategy.IGNORE)
    void updatePatientFromDto(PatientDTO dto,
                              @MappingTarget Patient entity);
}
