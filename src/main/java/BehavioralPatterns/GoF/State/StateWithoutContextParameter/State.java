package BehavioralPatterns.GoF.State.StateWithoutContextParameter;

public interface State {
    /*
        No args callers.
     */
    void on();
    void off();
}
