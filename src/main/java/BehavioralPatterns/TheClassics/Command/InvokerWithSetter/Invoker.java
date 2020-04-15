package BehavioralPatterns.TheClassics.Command.InvokerWithSetter;

public class Invoker {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
