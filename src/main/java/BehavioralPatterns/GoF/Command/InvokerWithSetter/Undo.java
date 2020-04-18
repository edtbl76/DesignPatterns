package BehavioralPatterns.GoF.Command.InvokerWithSetter;

public class Undo implements Command {

    private Receiver receiver;

    public Undo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // perform locally significant code first
        receiver.prepareUndo();

        // do the actual thing
        receiver.undo();
    }
}
