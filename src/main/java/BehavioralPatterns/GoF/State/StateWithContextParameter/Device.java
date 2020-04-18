package BehavioralPatterns.GoF.State.StateWithContextParameter;

public interface Device {

    State getState();
    void setState(State state);
    void on();
    void off();
}
