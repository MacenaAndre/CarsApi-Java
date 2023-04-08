package com.javacars.apicars.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacars.apicars.dto.carDTO;
import com.javacars.apicars.models.Car;
import com.javacars.apicars.repositories.CarRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @Autowired
    public CarRepository repository;

    @GetMapping
    public List<Car> findCars() {

        return repository.findAll();
        
    }
    
    @PostMapping
    public void createCar(@RequestBody @Valid carDTO req) {

        repository.save(new Car(req));

    }

    @PutMapping("/{id}")
    public void updateCar(@PathVariable Long id, @RequestBody @Valid carDTO req) {

        repository.findById(id).map(car -> {
            car.setModelo(req.modelo());
            car.setFabricante(req.fabricante());
            car.setData_fabricacao(req.data_fabricacao());
            car.setValor(req.valor());
            car.setAno_modelo(req.ano_modelo());
            return repository.save(car);
        });

    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        
        repository.deleteById(id);

    }
}
