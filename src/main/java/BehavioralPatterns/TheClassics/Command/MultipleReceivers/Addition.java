package BehavioralPatterns.TheClassics.Command.MultipleReceivers;

public class Addition implements Command {

    private Receiver receiver;

    public Addition(Receiver receiver) {
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
