package BehavioralPatterns.GoF.Mediator.BasicLimitedImplementation;

public class BackendService extends Service {

    public BackendService(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public String serviceType() {
        return "BackendService";
    }
}
