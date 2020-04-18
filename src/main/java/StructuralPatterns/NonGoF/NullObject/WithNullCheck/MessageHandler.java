package StructuralPatterns.NonGoF.NullObject.WithNullCheck;

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
