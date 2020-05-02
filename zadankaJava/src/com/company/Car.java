package com.company;

public class Car {
    final String producent;
    final String model;
    final Double engineSize;
    String color;
    Double price;
    
    public Car(String producent, String model, Double engineSize) {
        this.producent = producent;
        this.model = model;
        this.engineSize = engineSize;
    }
}
