package devices;
import com.company.Human;
import com.company.Saleable;

public abstract class Device implements Saleable {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public final Double value;

    public Device(String producer, String model, Integer yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public abstract void turnOn();

    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }

    @Override
    public String toString() {
        return "Producer: " + this.producer +  " Model: " + this.model + " Year of production: " + this.yearOfProduction + " Value: " + this.value;
    }
}
