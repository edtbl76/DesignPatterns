package BehavioralPatterns.GoF.Mediator.BasicLimitedImplementation;

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
    public void send(Service service, String message) throws InterruptedException {
        if (services.contains(service)) {
            System.out.println(service.getName() + " msgs:" + message + " posted at " + LocalDateTime.now());
            Thread.sleep(1000);
        } else {
            System.out.println("Unregistered Service - " + service.getName() + " - sent msg: " + message);
        }
    }
}
