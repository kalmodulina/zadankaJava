package com.company;
import devices.Car;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Zosia";
        me.lastName = "Kowalska";
        me.pet = new Animal("Lizard");

        me.setCar(new Car("BMW", "X7", 3.0));
        me.getCar();

        System.out.println(me.getCar().model);
    }
}
