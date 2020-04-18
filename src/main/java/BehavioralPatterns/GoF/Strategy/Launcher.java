package BehavioralPatterns.GoF.Strategy;

public class Launcher {

    public static void main(String[] args) {
        Vehicle context = new Boat();
        context.showMe();
        context.showTransportType();

        context = new Airplane();
        context.showMe();
        context.showTransportType();

    }
}
