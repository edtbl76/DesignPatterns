package BehavioralPatterns.GoF.Observer;

public class Launcher {

    public static void main(String[] args) {

        // Create Observers
        Observer observerOne1 = new ObserverOne("Ed");
        Observer observerOne2 = new ObserverOne("Paul");
        Observer observerTwo1 = new ObserverTwo("Anthony");

        // Register them
        Subject subject = new Subject();
        subject.register(observerOne1);
        subject.register(observerOne2);
        subject.register(observerTwo1);

        // Change data and watch the result
        subject.setFlag(1);

        // Deregister
        subject.deregister(observerTwo1);
        subject.setFlag(2);

        // Again
        subject.register(observerTwo1);
        subject.setFlag(3);
    }
}
