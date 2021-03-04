package com.example.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainersDto {

    private UUID id;

    private String name;

    private String lastName;

    private String email;

    private int phoneNumber;

    public TrainersDto(String name, String lastName, String email, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
