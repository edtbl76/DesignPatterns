package BehavioralPatterns.TheClassics.Mediator.BasicLimitedImplementation;

public interface Mediator {
    void register(Service service);
    void send(Service service, String message) throws InterruptedException;
}
