package devices;

import com.company.Human;

public abstract class Car extends Device {
    public final Double engineSize;
    public String color;
    
    public Car(String producer, String model, Integer yearOfProduction, Double value, Double engineSize, String color) {
        super(producer, model, yearOfProduction, value);
        this.engineSize = engineSize;
        this.color = color;
    }

    @Override
    public void turnOn() {
        System.out.println("OK");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.isCarInGarage(this)) {
            throw new Exception("You do not have this car in your garage. You cannot sell car which is not yours.");
        }
        if (!buyer.isFreeParkingSpace()) {
            throw new Exception("You do not have free parking space in your garage.");
        }
        if (buyer.cash < price) {
            throw new Exception("You do not have enough money to buy this car.");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        buyer.cash -= price;
        seller.cash += price;
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

    public abstract void refuel();

    public String toString() {
        return this.producer + " " + this.model + " " + this.engineSize;
    }
}
