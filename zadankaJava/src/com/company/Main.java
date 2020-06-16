package com.company;
import creatures.Pet;
import devices.Car;
import devices.Disel;
import devices.Electric;
import devices.Phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Zosia";
        me.lastName = "Kowalska";
        me.animal = new Pet("Lizard");

        me.animal.feed(12.5);
        me.animal.feed();



        Car car = new Disel("BMW", "X1", 2008, 32000.0,3.0, "black");
        me.setCar(car, 0);

        Car car2 = new Electric("Fiat", "Punto", 1999, 10000.0,2.4, "orange");
        me.setCar(car2, 1);

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.totalValueOfCarsInGarage());

        Phone phone = new Phone("Huawei", "P40", 2020, 1200.0, 20.0);
        System.out.println(phone);
        phone.turnOn();
    }
}
