package BehavioralPatterns.GoF.ChainOfResponsibility;

public interface Receiver {

    boolean handleMessage(Message message);
    void nextHandler(Receiver receiver);
}
