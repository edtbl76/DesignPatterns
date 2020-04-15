package BehavioralPatterns.TheClassics.Command.InvokerWithSetter;

public class Launcher {

    public static void main(String[] args) {

        /*
            Client creates both Invoker and Command objects
         */
        Receiver receiver = new Receiver();
        Undo undoCommand = new Undo(receiver);
        Redo redoCommand = new Redo(receiver);

        /*
            If we are using the setter inside the Invoker, then we don't have to provide the Command here.
         */
        Invoker invoker = new Invoker();

        /*
            But then we require a separate (lazy) step.
            - the advantage here is that we can use the same invoker to run multiple commands.
         */
        invoker.setCommand(undoCommand);
        invoker.invoke();

        invoker.setCommand(redoCommand);
        invoker.invoke();



    }
}
