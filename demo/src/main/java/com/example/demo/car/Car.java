package com.example.demo.car;

import java.time.LocalDate;

public class Car {
    private Long id;
    private String brand;
    private String model;
    private Double horsepower;
    private Double kilowatt;
    private LocalDate dateOfBuild;

    public Car() {
    }

    public Car(Long id, String brand, String model, Double horsepower, Double kilowatt, LocalDate dateOfBuild) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.kilowatt = kilowatt;
        this.dateOfBuild = dateOfBuild;
    }

    public Car(String brand, String model, Double horsepower, Double kilowatt, LocalDate dateOfBuild) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
        this.kilowatt = kilowatt;
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
        return kilowatt;
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
