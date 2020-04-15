package BehavioralPatterns.TheClassics.Command.MultipleReceivers;

public class PowerReceiver implements Receiver {

    private boolean status;

    public PowerReceiver() {
        System.out.println(this.getClass().getSimpleName() + " initialized");
        this.status = false;
    }

    @Override
    public void execute() {
        System.out.println("RCVD Request: power ON");
        if (!status) {
            System.out.println("Starting up");
            status = true;
        } else {
            System.out.println("System is running. Request Ignored");
        }
    }

    @Override
    public void revert() {
        System.out.println("RCVD Request: undo power state");
        if (status) {
            System.out.println("System is running.");
            status = false;
            System.out.println("\t Undo Request Complete: Shutting Down");
        } else {
            System.out.println("System is not running.");
            status = true;
            System.out.println("\t Undo Request Complete: Starting Up");
        }
    }
}
