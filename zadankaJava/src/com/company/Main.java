package com.company;
import creatures.Pet;
import devices.Car;
import devices.Disel;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Zosia";
        me.lastName = "Kowalska";
        me.animal = new Pet("Lizard");

        me.animal.feed(12.5);
        me.animal.feed();

        Car car = new Disel("BMW", "X1", 2008, 3.0, "black", 32000.0);
        System.out.println(car);
        car.turnOn();

        Phone phone = new Phone("Huawei", "P40", 2020, 20.0);
        System.out.println(phone);
        phone.turnOn();
    }
}
