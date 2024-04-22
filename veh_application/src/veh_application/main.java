package veh_application;

public class Main {
    public static void main(String[] args) {
        // Creating objects of Car and Bike classes
        Car myCar = new Car("Petrol", 200, "Toyota");
        Bike myBike = new Bike("Gasoline", 100, "Yamaha");

        // Printing data
        System.out.println("My car:");
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Engine Type: " + myCar.getType());
        System.out.println("Horsepower: " + myCar.getHorsepower());

        System.out.println("\nMy bike:");
        System.out.println("Model: " + myBike.getModel());
        System.out.println("Engine Type: " + myBike.getType());
        System.out.println("Horsepower: " + myBike.getHorsepower());
    }
}
