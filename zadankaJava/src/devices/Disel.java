package devices;

public class Disel extends Car {
    public Disel(String producer, String model, Integer yearOfProduction, Double value, Double engineSize, String color) {
        super(producer, model, yearOfProduction, value, engineSize, color);
    }

    @Override
    public void refuel() {

    }
}
