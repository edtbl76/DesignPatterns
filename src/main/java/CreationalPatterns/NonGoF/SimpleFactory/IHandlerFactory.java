package CreationalPatterns.NonGoF.SimpleFactory;

public interface IHandlerFactory {
    Handler createHandler(HandlerType handlerType);
}
