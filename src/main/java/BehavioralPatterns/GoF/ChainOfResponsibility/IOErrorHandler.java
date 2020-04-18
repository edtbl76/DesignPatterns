package BehavioralPatterns.GoF.ChainOfResponsibility;

public class IOErrorHandler implements Receiver {

    private Receiver receiver;
    @Override
    public boolean handleMessage(Message message) {
        if (message.getPayload().contains("IO")) {
            System.out.println("IOErrorHandler: " + message.getPayload() + ", Priority[" + message.getPriority() + "]");
            return true;
        } else {
            if (receiver != null)
                receiver.handleMessage(message);
        }
        return false;
    }

    @Override
    public void nextHandler(Receiver receiver) {
        this.receiver = receiver;
    }
}
