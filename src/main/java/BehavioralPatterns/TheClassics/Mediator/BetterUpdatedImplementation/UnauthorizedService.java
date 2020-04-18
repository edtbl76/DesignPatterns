package BehavioralPatterns.TheClassics.Mediator.BetterUpdatedImplementation;

public class UnauthorizedService extends Service{

    public UnauthorizedService(Mediator mediator, String name) {
        super(mediator, name, false);
    }

    @Override
    public void receive(Service source, String message) {
        System.out.println(this.name + message);
    }

    @Override
    public String serviceType() {
        return "UnauthorizedService";
    }
}
