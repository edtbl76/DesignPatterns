package BehavioralPatterns.TheClassics.Command.MultipleReceivers;

public class AdditionReceiver implements Receiver {

    private int number;

    public AdditionReceiver() {
        number = 10;
        System.out.println(this.getClass().getSimpleName() + " initialized with " + number);
        System.out.println("Objects of " + this.getClass().getSimpleName() + " can't set beyond " + number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void execute() {
        System.out.println("RCVD Request: Addition");

        System.out.print(getNumber() +" + 2 = ");
        setNumber(getNumber() + 2);
        System.out.println(getNumber());
    }

    @Override
    public void revert() {
        System.out.println("RCVD Request: Undo Addition");

        if (getNumber() > 10) {
            System.out.print(getNumber() + " - 2 = ");
            setNumber(getNumber() - 2);
            System.out.println(getNumber());
        } else {
            System.out.println("Nothing to undo...");
        }

    }
}
