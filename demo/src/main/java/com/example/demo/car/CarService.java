package com.example.demo.car;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Zur Markierung des Services als Komponente (Service), sodass Autowired die Komponente findet
@Service
public class CarService {
    public List<Car> getCars(){
        return List.of(
                new Car(
                        1L,
                        "Audi",
                        "A3 8PA",
                        150.0,
                        110.325,
                        LocalDate.of(2012, Month.APRIL, 11)
                )
        );
    }
}
