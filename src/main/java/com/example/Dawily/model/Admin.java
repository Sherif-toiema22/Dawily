package com.example.Dawily.model;

import jakarta.persistence.*;
import lombok.*;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Table(name = "admins" , uniqueConstraints =@UniqueConstraint(columnNames = "email") )
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String email;
}
