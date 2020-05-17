package devices;

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

    public String toString() {
        return this.producer + " " + this.model + " " + this.engineSize;
    }
}
