package devices;

public class Electric extends Car {
    public Electric(String producer, String model, Integer yearOfProduction, Double value, Double engineSize, String color) {
        super(producer, model, yearOfProduction, value, engineSize, color);
    }

    @Override
    public void refuel() {

    }
}
