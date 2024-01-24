package com.example.Dawily.service;

import com.example.Dawily.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    List<Patient> findAllPatients();

    Patient addPatient(Patient patient);

    void updatePatient(Patient patient);

    void deletePatient(Long id);

    Optional<Patient> findPatientById(Long id);
}
