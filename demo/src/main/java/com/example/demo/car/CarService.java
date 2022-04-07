package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Zur Markierung des Services als Komponente (Service), sodass Autowired die Komponente findet
@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public void addNewCar(Car car) {
        Optional<Car> carOptional = carRepository.findCarByModel(car.getModel());
        if (carOptional.isPresent()) {
            throw new IllegalArgumentException(("Model already registered"));
        }

        carRepository.save(car);
    }

    public void deleteStudent(Long carId) {
        boolean exists = carRepository.existsById(carId);
        if(!exists){
            throw new IllegalStateException("Car with this id does not exist.");
        }
        carRepository.deleteById(carId);
    }
}
