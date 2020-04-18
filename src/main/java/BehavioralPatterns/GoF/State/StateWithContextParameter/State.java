package BehavioralPatterns.GoF.State.StateWithContextParameter;

public interface State {
    void on(SpecificDevice device);
    void off(SpecificDevice device);
}
