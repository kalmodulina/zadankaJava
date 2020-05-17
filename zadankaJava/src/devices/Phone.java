package devices;

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

    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize;
    }
}

