package com.example.car.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Name;
import lombok.Data;

@Data
@Entity

public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;//제일 위에 있는게 프라이머리키

    private String category;

    private String price;

    private String fuel;

    private String Fuel_efficiency;

    private String car_power;

    private String engine;

    private String path;

}
