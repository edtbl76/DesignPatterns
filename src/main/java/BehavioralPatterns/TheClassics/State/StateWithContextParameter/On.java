package BehavioralPatterns.TheClassics.State.StateWithContextParameter;

public class On implements State {
    @Override
    public void on(SpecificDevice device) {
        System.out.println("Device is already on");
    }

    @Override
    public void off(SpecificDevice device) {
        System.out.println("Turning device off");
        device.setState(new Off());
        System.out.println(device.getState().toString());
    }

    @Override
    public String toString() {
        return "\tDevice is currently on";
    }
}
