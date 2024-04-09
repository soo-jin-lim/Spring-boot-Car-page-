package com.example.car.Service;

import com.example.car.Entity.CarEntity;
import com.example.car.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Page<CarEntity> findByCategory(String category, Pageable pageable){
        return carRepository.findByCategory(category,pageable);
    }


}
