package CreationalPatterns.NonGoF.SimpleFactory;

public class EventHandler implements Handler {

    @Override
    public void execute() {
        System.out.println("Handling an Event");
    }
}
