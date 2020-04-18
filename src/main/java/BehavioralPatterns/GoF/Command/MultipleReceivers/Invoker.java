package BehavioralPatterns.GoF.Command.MultipleReceivers;

public class Invoker {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
    public void undo() {
        command.revert();
    }
}
