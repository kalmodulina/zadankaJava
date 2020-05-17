package devices;

import com.company.Human;

public class Car extends Device {
    public final Double engineSize;
    public String color;
    public Double price = 12000.0;
    
    public Car(String producer, String model, Integer yearOfProduction, Double engineSize, String color, Double price) {
        super(producer, model, yearOfProduction);
        this.engineSize = engineSize;
        this.color = color;
        this.price = price;
    }

    @Override
    public void turnOn() {
        System.out.println("OK");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("You do not have enough money to buy this car.");
        }
        if (seller.getCar() != this) {
            throw new Exception("You cannot sell car which is not yours.");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.setCar(this);
        seller.setCar(null);
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.engineSize;
    }
}
