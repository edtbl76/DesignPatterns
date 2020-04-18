package BehavioralPatterns.GoF.ChainOfResponsibility;

public class ComputationErrorHandler implements Receiver {

    private Receiver receiver;
    @Override
    public boolean handleMessage(Message message) {
        if (message.getPayload().contains("Computation")) {
            System.out.println("ComputationErrorHandler: "
                    + message.getPayload() + ", Priority[" + message.getPriority() + "]");
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
