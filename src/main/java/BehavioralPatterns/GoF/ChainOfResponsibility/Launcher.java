package BehavioralPatterns.GoF.ChainOfResponsibility;

public class Launcher {

    public static void main(String[] args) {

        // Create a chain - Raiser -> IO -> Computation

        // Objects
        Receiver ioHandler, computationHandler;
        Dispatcher dispatcher = new Dispatcher();
        ioHandler = new IOErrorHandler();
        computationHandler = new ComputationErrorHandler();

        // Connect
        dispatcher.setFirstErrorHandler(ioHandler);
        ioHandler.nextHandler(computationHandler);
        computationHandler.nextHandler(null);

        // Create Some Messages
        Message message1 = new Message("IO error", MessagePriority.HIGH);
        Message message2 = new Message("Computation appears to be incorrect", MessagePriority.NORMAL);
        Message message3 = new Message("Computation is painfully slow", MessagePriority.HIGH);
        Message message4 = new Message("IO is slow", MessagePriority.NORMAL);

        // Do the thing.
        dispatcher.handleMessage(message1);
        dispatcher.handleMessage(message2);
        dispatcher.handleMessage(message3);
        dispatcher.handleMessage(message4);


    }
}
