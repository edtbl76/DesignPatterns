package BehavioralPatterns.GoF.Strategy;

public class WaterTransport implements TransportType {
    @Override
    public void transport() {
        System.out.println("I'm moving things via the water");
    }
}
