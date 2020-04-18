package CreationalPatterns.NonGoF.SimpleFactory;

public class MessageHandler implements Handler {
    @Override
    public void execute() {
       System.out.println("Handling a message");
    }
}
