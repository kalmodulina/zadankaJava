package devices;

import com.company.Human;

import java.net.URL;

public class Phone extends Device {
    public Double screenSize;
    static final String SERVER_URL = "127.0.0.1";
    static final int PORT = 8080;
    static final String VERSION = "1.0.0";

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

    public void installAnnApp(String name)
    {

    }
    public void installAnnApp(String name, String version)
    {

    }
    public void installAnnApp(String name, String version, String url)
    {

    }
    public void installAnnApp(String[] names)
    {

    }
    public void installAnnApp(URL url)
    {

    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize;
    }
}

