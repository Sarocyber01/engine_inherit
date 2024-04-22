package veh_application;

public class Car extends EngineModel {
    private String brand;

    // Constructor
    public Car(String type, int horsepower, String brand) {
        super(type, horsepower);
        this.brand = brand;
    }

    // Getter method
    public String getBrand() {
        return brand;
    }
}
