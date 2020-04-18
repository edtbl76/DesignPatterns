package BehavioralPatterns.GoF.Mediator.BasicLimitedImplementation;

public abstract class Service {

    protected Mediator mediator;
    protected String name;

    public Service(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) throws InterruptedException {
        mediator.send(this, message);
    }

    public abstract String serviceType();
}
