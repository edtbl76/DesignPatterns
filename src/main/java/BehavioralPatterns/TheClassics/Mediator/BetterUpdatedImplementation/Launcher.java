package BehavioralPatterns.TheClassics.Mediator.BetterUpdatedImplementation;

public class Launcher {

    public static void main(String[] args) throws InterruptedException {

        MediatorImpl mediator = new MediatorImpl();

        // Create a few services
        Service ui = new ServiceImpl(mediator, "UIService", true);
        Service storefront = new ServiceImpl(mediator, "StoreFrontService", true);
        Service platform = new ServiceImpl(mediator, "PlatformCoordinator", true);
        Service newService = new ServiceImpl(mediator, "PoorlyCodedService", false);
        Service hacker = new UnauthorizedService(mediator, "Ed");

        /*
            registration code is abstracted from client, but we can still display a list of registered uses.
         */
        mediator.printRegistry();

        System.out.println("System up, let's get to work.");

        ui.sendMessage(storefront, "Someone Wants To Shop");
        storefront.sendMessage(ui,"Opening Shop Page");
        platform.sendMessage(ui, "UIThread released for user requests");
        platform.sendMessage(storefront, "StoreFront allocated thread by dispatcher");

        newService.sendMessage(platform, "I'm a crappy service");
        hacker.sendMessage(newService, "Hahahaha, you opened up a backdoor!");

    }
}
