package BehavioralPatterns.GoF.Mediator.BetterUpdatedImplementation;

public interface Mediator {
    void register(Service service);
    void send(Service source, Service target, String message) throws InterruptedException;
}
