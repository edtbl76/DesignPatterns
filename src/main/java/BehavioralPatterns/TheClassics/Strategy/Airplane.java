package BehavioralPatterns.TheClassics.Strategy;

public class Airplane extends Vehicle {

    public Airplane() {
        transportType = new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("I'm a plane, watch me fly");
    }
}
