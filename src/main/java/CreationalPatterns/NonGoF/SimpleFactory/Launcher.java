package CreationalPatterns.NonGoF.SimpleFactory;

public class Launcher {

    public static void main(String[] args) {

        Handler handler = null;
        IHandlerFactory factory = new HandlerFactory();
        handler = factory.createHandler(HandlerType.EVENT);
        handler.execute();
    }
}
