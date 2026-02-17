package com.microservices.patient.service;

//import com.microservices.patient.model.dto.AddPatientDTO;
import com.microservices.patient.mapper.PatientMapper;
import com.microservices.patient.model.dto.PatientDTO;
import com.microservices.patient.model.entity.Patient;

import com.microservices.patient.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private  PatientRepository patientRepository;
    private  PatientMapper patientMapper;

//    @Autowired
//    public PatientService(PatientRepository patientRepository,
//                          PatientMapper patientMapper) {
//        this.patientRepository = patientRepository;
//        this.patientMapper = patientMapper;
//    }

    public PatientDTO save (PatientDTO dto){
        Patient patient = patientMapper.patientDTOtoPatient(dto);
        Patient saved = patientRepository.save(patient);
        return patientMapper.patientToPatientDTO (saved);
    }

    public List<PatientDTO> getAll() {
        return patientRepository.findAll()
                .stream()
                .map(patientMapper::patientToPatientDTO)
                .toList();
    }

    // READ BY ID
    public PatientDTO getById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        return patientMapper.patientToPatientDTO(patient);
    }

    public PatientDTO update(Long id, PatientDTO dto) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        patientMapper.updatePatientFromDto(dto, patient);

        return patientMapper.patientToPatientDTO(patientRepository.save(patient));
    }

    // DELETE
    public void delete(Long id) {
        patientRepository.deleteById(id);
    }
}
