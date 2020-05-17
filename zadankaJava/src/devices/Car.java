package devices;

public class Car {
    public final String producer;
    public final String model;
    public final Double engineSize;
    public String color;
    public Double price;
    
    public Car(String producent, String model, Double engineSize) {
        this.producer = producent;
        this.model = model;
        this.engineSize = engineSize;
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.engineSize;
    }
}
