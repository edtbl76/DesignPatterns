package BehavioralPatterns.TheClassics.Command.MultipleReceivers;

public class Power implements Command {

    private Receiver receiver;

    public Power(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.execute();
    }

    @Override
    public void revert() {
        receiver.revert();
    }
}
