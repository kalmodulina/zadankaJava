package devices;

public class Application {
    private final String name;
    public final String version;
    private final Double price;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public String toString() {
        return "Name: " + this.name + " Version: " + this.version + " Price: " + this.price;
    }

}
