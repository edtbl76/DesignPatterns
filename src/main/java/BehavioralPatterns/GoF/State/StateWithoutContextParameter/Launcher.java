package BehavioralPatterns.GoF.State.StateWithoutContextParameter;

public class Launcher {

    public static void main(String[] args) {

        /*
            Despite the internal changes to the pattern, the impact is hidden from the client.
         */
        // Create an instance of our Context Object (Device), which is off by default
        SpecificDevice device = new SpecificDevice();

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
