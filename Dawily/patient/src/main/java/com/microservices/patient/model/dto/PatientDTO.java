package com.microservices.patient.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    private Integer patientId;
    private String patientName;
    private Integer patientAge;

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                '}';
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }
}
