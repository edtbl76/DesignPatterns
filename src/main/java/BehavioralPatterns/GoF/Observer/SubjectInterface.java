package BehavioralPatterns.GoF.Observer;

public interface SubjectInterface {
    void register(Observer observer);
    void deregister(Observer observer);
    void notify(int notifiedValue);
}
