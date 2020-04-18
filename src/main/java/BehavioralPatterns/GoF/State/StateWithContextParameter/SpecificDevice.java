package BehavioralPatterns.GoF.State.StateWithContextParameter;

public class SpecificDevice implements Device {

    private State state;

    public SpecificDevice() {
        // Starts off by default
        this.state = new Off();
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void on() {
        state.on(this);
    }

    @Override
    public void off() {
        state.off(this);
    }
}
