package com.microservices.patient.model.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "patients")
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name ="patient_age")
    private Integer patientAge;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", patientAge=" + patientAge +
                '}';
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
//    public String getPatientName() {
//        return patientName;
//    }
//

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
//    public void setPatientName(String patientName) {
//        this.patientName = patientName;
//    }
//
//    public Integer getPatientAge() {
//        return patientAge;
//    }
//
//    public void setPatientAge(Integer patientAge) {
//        this.patientAge = patientAge;
//    }
}
