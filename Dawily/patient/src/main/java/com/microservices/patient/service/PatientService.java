package com.microservices.patient.service;

//import com.microservices.patient.model.dto.AddPatientDTO;
import com.microservices.patient.mapper.PatientMapper;
import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.model.entity.Patient;

import com.microservices.patient.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@RequiredArgsConstructor
@Transactional
@Slf4j
public class PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public PatientService(PatientRepository patientRepository,
                          PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    public PatientDTO save (PatientDTO dto){
        Patient patient = patientMapper.toEntity(dto);
        Patient saved = patientRepository.save(patient);
        return patientMapper.toDto (saved);
    }

    public List<PatientDTO> getAll() {
        return patientRepository.findAll()
                .stream()
                .map(patientMapper::toDto)
                .toList();
    }

    // READ BY ID
    public PatientDTO getById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        return patientMapper.toDto(patient);
    }

    public PatientDTO update(Long id, PatientDTO dto) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        patientMapper.updatePatientFromDto(dto, patient);

        return patientMapper.toDto(patientRepository.save(patient));
    }

    // DELETE
    public void delete(Long id) {
        patientRepository.deleteById(id);
    }
}
