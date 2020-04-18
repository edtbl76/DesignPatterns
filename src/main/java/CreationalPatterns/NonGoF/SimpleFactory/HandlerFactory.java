package CreationalPatterns.NonGoF.SimpleFactory;

public class HandlerFactory implements IHandlerFactory {

    @Override
    public Handler createHandler(HandlerType handlerType) {
        Handler handler = null;

        switch (handlerType) {
            case EVENT:
                handler = new EventHandler();
                break;
            case MESSAGE:
                handler = new MessageHandler();
            default:
                throw new IllegalArgumentException("Invalid Handler Type");
        }
        return handler;
    }
}
