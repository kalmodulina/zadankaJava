package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Zosia";
        me.lastName = "Kowalska";
        me.pet = new Animal("Lizard");

        me.car = new Car("BMW", "X7", 3.0);
        me.car.color = "Black";

        System.out.println(me.car.model);
    }
}
