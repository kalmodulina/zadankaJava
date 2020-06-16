package com.company;
import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;

public class Human implements Saleable{
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal animal;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    private Car[] garage;
    private Double salary;
    public Double cash;

    public Human() {
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garageSize) {
        this.garage = new Car[garageSize];
    }

    public Double getSalary(){
        System.out.println("Your data about salary were downloaded a week ago and were equal to 4500.");
        return this.salary;
    }

    public void setSalary(Double salary){
        if(salary < 0.0)
        {
            throw new IllegalArgumentException("Salary must be non-negative.");
        }
        else {
            System.out.println("New data has been sent to the accounting system.");
            System.out.println("You must collect the annex to the contract from Ms. Hania.");
            System.out.println("ZUS and US know about the salary change.");
            this.salary = salary;
        }
    }

    public Car getCar(Integer parkingSpaceNumber){
        return this.garage[parkingSpaceNumber];
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public void setCar(Car car, Integer parkingSpaceNumber){
        if(this.salary > car.value){
            System.out.println("You bought a car for cash.");
            this.garage[parkingSpaceNumber] = car;
        } else if(this.salary > (car.value/12.0)) {
            System.out.println("You bought a car for a credit.");
            this.garage[parkingSpaceNumber] = car;
        } else {
            System.out.println("Your salary is too low to buy this car.");
        }
    }

    public Double totalValueOfCarsInGarage() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }

    public void sortGarage() {
        Arrays.sort(this.garage);
    }

    public boolean isCarInGarage(Car car) {
        for (Car carInGarage : garage) {
            if (carInGarage == car) {
                return true;
            }
        }
        return false;
    }

    public boolean isFreeParkingSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car car) throws Exception {
        if (this.isFreeParkingSpace()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = car;
                    break;
                }
            }
        } else {
            throw new Exception("You do not have free parking space in your garage.");
        }
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new Exception("Human trafficking is prohibited.");
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.phone + " " + this.animal;
    }
}
