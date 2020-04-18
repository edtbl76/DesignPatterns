package BehavioralPatterns.TheClassics.Mediator.BasicLimitedImplementation;

public class UnknownService extends Service {

    public UnknownService(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public String serviceType() {
        return "UnknownService";
    }
}
