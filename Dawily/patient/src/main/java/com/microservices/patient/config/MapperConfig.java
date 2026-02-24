package com.microservices.patient.config;

import com.microservices.patient.mapper.PatientMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public PatientMapper patientMapper() {
        return Mappers.getMapper(PatientMapper.class);
    }
}