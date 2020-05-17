package devices;

public class Disel extends Car {
    public Disel(String producer, String model, Integer yearOfProduction, Double engineSize, String color, Double price) {
        super(producer, model, yearOfProduction, engineSize, color, price);
    }

    @Override
    public void refuel() {

    }
}
