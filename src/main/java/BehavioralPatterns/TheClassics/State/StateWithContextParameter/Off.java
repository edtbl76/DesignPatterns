package BehavioralPatterns.TheClassics.State.StateWithContextParameter;

public class Off implements State {
    @Override
    public void on(SpecificDevice device) {
        System.out.println("Turning Device On");
        device.setState(new On());
        System.out.println(device.getState().toString());
    }

    @Override
    public void off(SpecificDevice device) {
        System.out.println("Device already off");
    }

    @Override
    public String toString() {
        return "\tDevice is currently off";
    }
}
