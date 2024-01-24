package com.example.Dawily.model;

import jakarta.persistence.*;
import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
@Table(name = "patients" , uniqueConstraints =@UniqueConstraint(columnNames = "email") )
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String email;

    private String address;

    private Long age;

    private String phone_number;
}
