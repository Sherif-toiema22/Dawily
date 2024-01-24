package com.example.Dawily.model;

import jakarta.persistence.*;
import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Table(name = "doctors" , uniqueConstraints =@UniqueConstraint(columnNames = "email") )
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String address;

    private String email;

    private Long age;

    private String phone_number;
}
