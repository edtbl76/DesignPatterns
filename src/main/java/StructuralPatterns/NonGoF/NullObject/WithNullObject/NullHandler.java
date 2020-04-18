package StructuralPatterns.NonGoF.NullObject.WithNullObject;

public class NullHandler implements Handler {

    // Eager
    private static NullHandler instance = new NullHandler();
    public static int count;

    private NullHandler() {
        System.out.println("Null Handler created [" + count++ + "]");
    }

    public static NullHandler getInstance() {
        return instance;
    }

    @Override
    public void execute() {
        //Null Object Does Nada
    }
}
