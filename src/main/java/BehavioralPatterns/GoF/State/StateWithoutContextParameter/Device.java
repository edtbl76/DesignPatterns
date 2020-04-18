package BehavioralPatterns.GoF.State.StateWithoutContextParameter;


public interface Device {

    State getCurrent();
    void setCurrent(State current);
    State getOnState();
    State getOffState();
    void on();
    void off();

}
