package devices;

public class Phone {
    public String producer;
    public String model;
    public Double screenSize;

    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize;
    }
}

