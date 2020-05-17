package com.company;
import devices.Car;
import devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;

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

    public Car getCar(){
        return this.car;
    }

    public void setCar(Car car){
        if(this.salary > car.price){
            System.out.println("You bought a car for cash.");
            this.car = car;
        } else if(this.salary > (car.price/12.0)) {
            System.out.println("You bought a car for a credit.");
            this.car = car;
        } else {
            System.out.println("Your salary is too low to buy this car.");
        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.phone + " " + this.pet;
    }
}
