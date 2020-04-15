package BehavioralPatterns.TheClassics.Command.MultipleReceivers;

public class Launcher {

    public static void main(String[] args) {

        /*
            Client creates both Invoker and Command objects
         */

        // Test Addition Receiver/Command
        Receiver additionReceiver = new AdditionReceiver();
        Command add = new Addition(additionReceiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(add);

        // Testing both
        invoker.invoke();
        invoker.undo();

        // Fun Tests - exec x 2, undo x 3
        invoker.invoke();
        invoker.invoke();
        invoker.undo();
        invoker.undo();
        invoker.undo();

        // Test Power Receiver/Command
        Receiver powerReceiver = new PowerReceiver();
        Command power = new Power(powerReceiver);
        invoker.setCommand(power);

        // Testing both
        invoker.invoke();
        invoker.undo();

        // Fun Tests - exec x 2, undo x 3
        invoker.invoke();
        invoker.invoke();
        invoker.undo();
        invoker.undo();
        invoker.undo();

    }
}
