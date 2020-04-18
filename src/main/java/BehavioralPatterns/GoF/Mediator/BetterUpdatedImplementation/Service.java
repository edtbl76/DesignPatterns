package BehavioralPatterns.GoF.Mediator.BetterUpdatedImplementation;

public abstract class Service {

    protected Mediator mediator;
    protected String name;
    private boolean authorizedUser;

    public Service(Mediator mediator, String name, boolean authorizedUser) {
        this.mediator = mediator;
        this.name = name;
        this.authorizedUser = authorizedUser;
        // Automatic registration on creation
        if (authorizedUser) {
            mediator.register(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(Service target, String message) throws InterruptedException {
        mediator.send(this, target, message);
    }

    public void receive(Service source, String message) {
        System.out.println(this.name + " received message: [" + message + "] from " + source.getName());
    }
    public abstract String serviceType();
}
