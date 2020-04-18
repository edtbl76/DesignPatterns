package BehavioralPatterns.GoF.Command.InvokerWithSetter;

public class Receiver {

    public void undo() {
        System.out.println("Performing undo in Receiver");
    }

    public void redo() {
        System.out.println("Performing redo in Receiver");
    }

    public void prepareUndo() {
       System.out.println("Preparing Undo");
    }

    public void prepareRedo() {
        System.out.println("Preparing Redo");
    }
}
