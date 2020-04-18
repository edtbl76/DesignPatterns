package BehavioralPatterns.GoF.Mediator.BasicLimitedImplementation;

public class Launcher {

    public static void main(String[] args) throws InterruptedException {

        /*
            Limitations of this example
                - messages only flow in one direction
                - no security/privacy
                    - all messages are visible to all participants
                    - only registered users/systems can communicate.
                    (There is no distinction between someone who forgets to register and an Outsider...although i'm
                    ok w/ that)
                - client code is responsible for registering systems
                    - this should be handled by the back end.
         */
        MediatorImpl mediator = new MediatorImpl();

        // Create a few services
        FrontEndService ui = new FrontEndService(mediator, "UIService");
        FrontEndService storefront = new FrontEndService(mediator, "StoreFrontService");
        BackendService platform = new BackendService(mediator, "PlatformCoordinator");
        UnknownService hacker = new UnknownService(mediator, "Ed");

        // Register Services
        mediator.register(ui);
        mediator.register(storefront);
        mediator.register(platform);

        // Validate Registration (display it)
        mediator.printRegistry();

        System.out.println("System up, let's get to work.");

        ui.sendMessage("Someone Wants To Shop");
        storefront.sendMessage("Opening Shop Page");
        hacker.sendMessage("Gimme all of your money!");

    }
}
