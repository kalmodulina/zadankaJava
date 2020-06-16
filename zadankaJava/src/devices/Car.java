package devices;
import com.company.Human;
import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    public final Double engineSize;
    public String color;
    private List<Human> owners = new ArrayList<Human>();
    
    public Car(String producer, String model, Integer yearOfProduction, Double value, Double engineSize, String color) {
        super(producer, model, yearOfProduction, value);
        this.engineSize = engineSize;
        this.color = color;
    }

    public Human getOwner(){
        return this.owners.get(owners.size() - 1);
    }

    public boolean isOwner(Human owner) {
        if (owners.get(owners.size() - 1) == owner) {
            return true;
        }
        return false;
    }

    public boolean wasOwner(Human human) {
        for (int i = 0; i < this.owners.size() - 2; i++) {
            if (this.owners.get(i) == human) {
                return true;
            }
        }
        return false;
    }

    public boolean wasSellerAndBuyer(Human seller, Human buyer) {
        for (int i = 0; i < this.owners.size() - 2; i++) {
            if (this.owners.get(i) == seller && this.owners.get(i + 1) == buyer) {
                return true;
            }
        }
        return false;
    }

    public Integer transactionCount() {
        return this.owners.size() - 1;
    }

    public void addNewOwner(Human newOwner) throws Exception {
        if (!this.isOwner(newOwner)) {
            owners.add(newOwner);
        } else {
            throw new Exception("Already you are an owner of this car.");
        }
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
        if (!isOwner(seller)) {
            throw new Exception("You are not an owner of this car so you cannot sell it.");
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
        addNewOwner(buyer);
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

    public abstract void refuel();

    public String toString() {
        return this.producer + " " + this.model + " " + this.engineSize;
    }
}
