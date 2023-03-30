package com.javacars.apicars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacars.apicars.models.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
