package BehavioralPatterns.TheClassics.Visitor.BareAndComposite;

public interface Soldier {

    void printChainOfCommand();
    void accept(Visitor visitor);
}
