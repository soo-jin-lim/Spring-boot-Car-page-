package com.example.car.Repository;

import com.example.car.Entity.CarEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<CarEntity,String> {


    Page<CarEntity> findByCategory(String category,Pageable pageable);

}
