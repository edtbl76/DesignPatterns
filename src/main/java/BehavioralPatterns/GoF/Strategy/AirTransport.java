package BehavioralPatterns.GoF.Strategy;

public class AirTransport implements TransportType {
    @Override
    public void transport() {
        System.out.println("I'm moving things in the air");
    }
}
