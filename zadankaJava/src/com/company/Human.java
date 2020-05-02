package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    Car car;
    private Double salary;

    public Double getSalary(){
        System.out.println("Your data about salary were downloaded a week ago and were equal to 4500.");
        return salary;
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
}
