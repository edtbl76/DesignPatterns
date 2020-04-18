package BehavioralPatterns.GoF.State.StateWithoutContextParameter;

public class On implements State {

    SpecificDevice device;

    /*
        Since the method contract doesn't allow us to pass the CONTEXT, we have to do it in the constructor
     */
    public On(SpecificDevice device) {
        this.device = device;
    }

    @Override
    public void on(){
        System.out.println("Device is already on");
    }

    @Override
    public void off() {
        System.out.println("Turning device off");
        device.setCurrent(device.getOffState());
        System.out.println(device.getCurrent().toString());
    }

    @Override
    public String toString() {
        return "\tDevice is currently on";
    }
}
