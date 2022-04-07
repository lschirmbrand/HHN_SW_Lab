package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/car")
public class CarController {

    private final CarService carService;

    // Instanziert den carservice automatisch, dependency injection
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    //Nutzt GET um Daten abzufragen und darzustellen
    @GetMapping
    public List<Car> getCars(){
        return carService.getCars();
    }

    // Nutzt POST um Daten an die Datenbank/Server zu senden
    @PostMapping
    public void registerNewCar(@RequestBody Car car){
        carService.addNewCar(car);
    }

    @DeleteMapping(path = "{carId}")
    public void deleteCar(@PathVariable("carId") Long carId ) {
        carService.deleteStudent(carId);
    }

}
