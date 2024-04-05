package com.example.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String categoty;

    private String name;

    private String price;

    private String fuel;

    private String Fuel_efficiency;

    private String car_power;

    private String engine;
}
