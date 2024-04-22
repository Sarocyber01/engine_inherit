package veh_application;

public class EngineModel {
    private String type;
    private int horsepower;

    // Constructor
    public EngineModel(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    // Getter methods
    public String getType() {
        return type;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
