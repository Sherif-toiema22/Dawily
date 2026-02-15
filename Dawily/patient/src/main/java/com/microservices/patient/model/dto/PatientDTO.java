package com.microservices.patient.model.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    private Integer patientId;
    private String patientName;
    private Integer patientAge;

}
