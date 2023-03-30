package com.javacars.apicars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacars.apicars.dto.carDTO;
import com.javacars.apicars.models.Car;
import com.javacars.apicars.repositories.CarRepository;

@RestController
@RequestMapping("/api/cars")

public class CarsController {

    @Autowired
    private CarRepository repository;
    
    @PostMapping
    public void createCars(@RequestBody carDTO req) {

        repository.save(new Car(req));
        
    }
}
