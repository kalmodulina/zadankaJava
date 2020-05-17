package devices;

import com.company.Human;

public class Phone extends Device {
    public Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
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
        if (seller.phone != this) {
            throw new Exception("You cannot sell phone which is not yours.");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = this;
        seller.phone = null;
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize;
    }
}

