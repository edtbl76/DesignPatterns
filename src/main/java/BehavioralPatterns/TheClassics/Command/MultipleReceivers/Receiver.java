package BehavioralPatterns.TheClassics.Command.MultipleReceivers;

public interface Receiver {

    /*
        These aren't named very well, but the idea is to demonstrate how we can use the concept of do/undo
        for very different types of commands/receivers.
     */
    void execute();
    void revert();

}
