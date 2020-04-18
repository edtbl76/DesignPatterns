package BehavioralPatterns.GoF.Mediator.BasicLimitedImplementation;

public class FrontEndService extends Service {

    public FrontEndService(Mediator mediator, String name) {
        super(mediator);
        this.name = name;
    }

    @Override
    public String serviceType() {
        return "FrontEndService";
    }
}
