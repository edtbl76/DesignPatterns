package StructuralPatterns.NonGoF.NullObject.WithoutNullObject;

public class EventHandler implements Handler {

    public static int count = 0;

    public EventHandler() {
        count++;
    }

    @Override
    public void execute() {
        System.out.println("Handling event");
    }
}
