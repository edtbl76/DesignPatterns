package StructuralPatterns.NonGoF.NullObject.WithoutNullObject;

public class MessageHandler implements Handler {

    public static int count = 0;

    public MessageHandler() {
        count++;
    }

    @Override
    public void execute() {
        System.out.println("Handling message");
    }
}
