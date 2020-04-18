package BehavioralPatterns.TheClassics.State.StateWithoutContextParameter;

public class SpecificDevice implements Device{

    private State current;
    private final State onState;
    private final State offState;

    /*
        Context class is a little bit larger, and more tightly coupled to the states.
        Since the State interface doesn't define a method contract that takes the Context as a parameter,
        we have to internalize the state back into the Context (which really defeats the purpose of using the pattern)

     */
    public SpecificDevice() {
        this.onState = new On(this);
        this.offState = new Off(this);
        setCurrent(offState);
    }


    @Override
    public State getCurrent() {
        return current;
    }

    @Override
    public void setCurrent(State current) {
        this.current = current;
    }

    @Override
    public State getOnState() {
        return onState;
    }

    @Override
    public State getOffState() {
        return offState;
    }

    @Override
    public void on() {
        current.on();
    }

    @Override
    public void off() {
        current.off();
    }

}
