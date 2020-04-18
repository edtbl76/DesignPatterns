package BehavioralPatterns.GoF.Command.InvokerWithParameterizedConstructor;

public class Redo implements Command {

    private Receiver receiver;

    public Redo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // perform locally significant code first
        receiver.prepareRedo();

        // do the actual thing
        receiver.redo();
    }
}
