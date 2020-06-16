package com.company;
import creatures.Pet;
import devices.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Zosia";
        me.lastName = "Kowalska";
        me.animal = new Pet("Lizard");

        me.animal.feed(12.5);
        me.animal.feed();
        me.cash = 60000.0;



        Car car = new Disel("BMW", "X1", 2008, 32000.0,3.0, "black");
        me.setCar(car, 0);
        System.out.println(car.transactionCount());
        System.out.println(car.isOwner(me));
        System.out.println(car.wasOwner(me));
        System.out.println(car.wasSellerAndBuyer(me, new Human()));

        Car car2 = new Electric("Fiat", "Punto", 1999, 10000.0,2.4, "orange");
        me.setCar(car2, 1);

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.totalValueOfCarsInGarage());

        Phone phone = new Phone("Huawei", "P40", 2020, 1200.0, 20.0);
        me.phone = phone;

        Application application = new Application("App", "v 1.0", 0.0);
        phone.installApplication(me, application);
        Application application2 = new Application("App2", "v 1.2", 12.0);
        phone.installApplication(me, application2);
        System.out.println("All installed application applications: ");
        System.out.println(Arrays.toString(phone.allInstalledApplications().toArray()));
        phone.printAllFreeApplications();
        phone.printAllInstalledApplicationNamesInAlphabeticalOrder();
        phone.printAllInstalledApplicationNamesInPriceOrder();
        System.out.println(phone.isApplicationWithGivenNameAlreadyInstalled(application.getName()));
        System.out.println(phone.isApplicationWithGivenNameAlreadyInstalled("Not exist"));
    }
}
