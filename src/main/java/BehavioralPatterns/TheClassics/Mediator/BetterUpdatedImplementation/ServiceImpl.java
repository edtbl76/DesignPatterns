package BehavioralPatterns.TheClassics.Mediator.BetterUpdatedImplementation;

public class ServiceImpl extends Service {

    public ServiceImpl(Mediator mediator, String name, boolean authorizedUser) {
        super(mediator, name, authorizedUser);
    }

    @Override
    public String serviceType() {
        return name;
    }
}
