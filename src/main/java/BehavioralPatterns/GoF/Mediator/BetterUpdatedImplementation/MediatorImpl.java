package BehavioralPatterns.GoF.Mediator.BetterUpdatedImplementation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

    List<Service> services = new ArrayList<>();

    @Override
    public void register(Service service) {
        services.add(service);
    }

    public void printRegistry() {
        System.out.println("Service Registry: ");
        services.forEach(service -> System.out.println("\t" + service.getName()));
    }

    @Override
    public void send(Service source, Service target, String message) throws InterruptedException {

        if (source.serviceType() == "UnauthorizedUser") {
            System.out.println("Unauthorized user - " + source.getName() + " - attempted to send message: "
                    + message + " to " + target.getName());
            target.receive(target, ", You aren't authorized for access");
        } else if (services.contains(source)) {
            System.out.println(source.getName() + " posted message at " + LocalDateTime.now());
            Thread.sleep(1000);

            if (services.contains(target)) {
                target.receive(source, message);
            } else {
                System.out.println(source.getName() + ", Undeliverable. + "
                        + target.getName() + " is not a registered service");
            }
        } else {
            System.out.println("Unregistered Service- " + source.getName() + " - attempted to send messages to "
                    + target.getName());
            System.out.println(source.getName() + " only registered services may send messages");
        }
    }
}
