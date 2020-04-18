package BehavioralPatterns.TheClassics.ChainOfResponsibility;

public interface Receiver {

    boolean handleMessage(Message message);
    void nextHandler(Receiver receiver);
}
