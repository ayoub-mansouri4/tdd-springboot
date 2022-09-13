package com.example.tdd.models;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String phoneNumber;


}
