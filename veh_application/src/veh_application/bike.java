package veh_application;

public class Bike extends EngineModel {
    private String model;

    // Constructor
    public Bike(String type, int horsepower, String model) {
        super(type, horsepower);
        this.model = model;
    }

    // Getter method
    public String getModel() {
        return model;
    }
}
