package BehavioralPatterns.GoF.Command.MultipleReceivers;

public interface Command {
    /*
        NoArgs Method
            - info should be supplied at creation time
            - invoker might reside in a different address space
            - usually named do(), run(), execute() etc.
     */
    void execute();
    void revert();
}
