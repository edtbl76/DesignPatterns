package BehavioralPatterns.TheClassics.Strategy;

// Context Object
public abstract class Vehicle {

    // Context Objects should always contain a reference variable for the strategy object's INTERFACE type
    TransportType transportType;

    public Vehicle() {
    }

    // Allows the transport type to determine what to do. If I have 1000 different transport types (that would suck)
    // I wouldn't have to change this code.
    public void showTransportType() {
        transportType.transport();
    }

    public abstract void showMe();

    // final methods are the ones in a Strategy that should not be overridden, because they define the overall
    // algo structure.
    public final void commonJob() {
        System.out.println("We all can be used to transport!");
    }

}
