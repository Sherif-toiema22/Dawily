package com.example.Dawily.service;

import com.example.Dawily.model.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
    List<Doctor> findAllDoctors();

    Doctor addDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(Long id);

    Optional<Doctor> findDoctorById(Long id);
}
