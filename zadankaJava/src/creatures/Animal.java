package creatures;
import com.company.Human;
import com.company.Saleable;

public abstract class Animal implements Saleable, Feedable {
    public final String species;
    public String name;
    private Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 11.0;
    static final Double DEFAULT_LION_WEIGHT = 180.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }

    }

    public void feed() {
        if (weight <= 0.0) {
            System.out.println("Too late for food.");
        } else {
            weight += 0.1;
            System.out.println("My weight is now " + weight);
        }
    }

    public void feed(Double foodWeight) {
        if (weight <= 0.0) {
            System.out.println("Too late for food.");
        } else {
            weight += foodWeight;
            System.out.println("My weight is now " + weight);
        }
    }

    void takeForAWalk() {
        if (weight <= 0.0) {
            System.out.println("cannot walk the town with dead animal you freak");
        } else if (weight <= 1.0) {
            System.out.println("thx for a walk but I'm hungry, my weight is now " + weight);
            weight -= 0.1;
        } else {
            System.out.println("thx for a walk, my weight is now " + weight);
            weight -= 0.1;
        }
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("You do not have enough money to buy this car.");
        }
        if (seller.animal != this) {
            throw new Exception("You cannot sell animal which is not yours.");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.animal = this;
        seller.animal = null;
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

    public String toString() {
        return this.species + " " + this.name;
    }
}
