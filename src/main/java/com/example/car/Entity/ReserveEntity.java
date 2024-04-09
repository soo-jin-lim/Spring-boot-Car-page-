package com.example.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class ReserveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;

    private String email;

    private String car;

    private String days;
}
