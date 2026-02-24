package com.microservices.patient.mapper;

import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.model.entity.Patient;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface PatientMapper {

    // 🔹 Entity → DTO
    PatientDTO toDto(Patient patient);

    // 🔹 DTO → Entity
    Patient toEntity(PatientDTO dto);

    // 🔥 Update existing entity (PUT style)
    @Mapping(target = "id", ignore = true)
    void updatePatientFromDto(PatientDTO dto, @MappingTarget Patient patient);

    // 🔥 Partial update (PATCH style)
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    @Mapping(target = "id", ignore = true)
//    void partialUpdate(PatientDTO dto, @MappingTarget Patient patient);
}