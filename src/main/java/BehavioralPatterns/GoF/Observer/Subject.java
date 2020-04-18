package BehavioralPatterns.GoF.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface {

    private int flag;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(int notifiedValue) {
        observers.forEach(observer -> observer.update(notifiedValue));
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;

        // Since the data changes we want to notify our subscribers.
        notify(flag);
    }
}
