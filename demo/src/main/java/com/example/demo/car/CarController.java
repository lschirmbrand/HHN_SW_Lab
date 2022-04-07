package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
