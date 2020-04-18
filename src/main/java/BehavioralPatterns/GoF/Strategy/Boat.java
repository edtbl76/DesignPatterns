package BehavioralPatterns.GoF.Strategy;

public class Boat extends Vehicle {

    public Boat() {
        transportType = new WaterTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I'm a boat, glub glub.");
    }
}
