package BehavioralPatterns.GoF.ChainOfResponsibility;

public class Dispatcher {

    public Receiver root;

    public void setFirstErrorHandler(Receiver receiver) {
        this.root = receiver;
    }

    public void handleMessage(Message message) {
        if (root != null)
            root.handleMessage(message);
    }
}
