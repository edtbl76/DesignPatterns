package BehavioralPatterns.GoF.State.StateWithContextParameter;

public class Launcher {

    public static void main(String[] args) {

        // Create an instance of our Context Object (Device), which is off by default
        Device device = new SpecificDevice();

        /*
            Off, On, on , Off, Off
         */
        device.off();
        device.on();
        device.on();
        device.off();
        device.off();

    }
}
