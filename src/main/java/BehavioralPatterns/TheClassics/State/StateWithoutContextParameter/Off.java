package BehavioralPatterns.TheClassics.State.StateWithoutContextParameter;

public class Off implements State {

    SpecificDevice device;

    /*
        Since the method contract doesn't allow us to pass the CONTEXT, we have to do it in the constructor
     */
    public Off(SpecificDevice device) {
        this.device = device;
    }

    @Override
    public void on() {
        System.out.println("Turning Device On");
        device.setCurrent(device.getOnState());
        System.out.println(device.getCurrent().toString());
    }

    @Override
    public void off() {
        System.out.println("Device already off");
    }

    @Override
    public String toString() {
        return "\tDevice is currently off";
    }
}
