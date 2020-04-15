package BehavioralPatterns.TheClassics.Command.InvokerWithParameterizedConstructor;

public class Launcher {

    public static void main(String[] args) {

        /*
            Client creates both Invoker and Command objects
         */
        Receiver receiver = new Receiver();
        Undo undoCommand = new Undo(receiver);
        Redo redoCommand = new Redo(receiver);

        /*
            - Slightly cleaner/more-terse implementation by passing in the command.
         */
        Invoker invoker = new Invoker(undoCommand);
        invoker.invoke();

        /*
            Slightly more expensive, because I'm creating a new instance of the Invoker.
            - possible solutions
                - a setter that resets the value
                - static/Singleton (doesn't scale or test well)
         */
        invoker = new Invoker(redoCommand);
        invoker.invoke();



    }
}
