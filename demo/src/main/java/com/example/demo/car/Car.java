package com.example.demo.car;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Car {
    @Id
    @SequenceGenerator(
            name = "car_sequence",
            sequenceName = "car_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String brand;
    private String model;
    private Double horsepower;
    @Transient
    private Double kilowatt;
    private LocalDate dateOfBuild;

    public Car() {
    }

    public Car(Long id, String brand, String model, Double horsepower, LocalDate dateOfBuild) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.dateOfBuild = dateOfBuild;
    }

    public Car(String brand, String model, Double horsepower, LocalDate dateOfBuild) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;;
        this.dateOfBuild = dateOfBuild;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Double horsepower) {
        this.horsepower = horsepower;
    }

    public Double getKilowatt() {
        return Math.round(this.horsepower/1.36 * 100.00) / 100.00;
    }

    public void setKilowatt(Double kilowatt) {
        this.kilowatt = kilowatt;
    }

    public LocalDate getDateOfBuild() {
        return dateOfBuild;
    }

    public void setDateOfBuild(LocalDate dateOfBuild) {
        this.dateOfBuild = dateOfBuild;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", horsepower=" + horsepower +
                ", kilowatt=" + kilowatt +
                ", dateOfBuild=" + dateOfBuild +
                '}';
    }
}
