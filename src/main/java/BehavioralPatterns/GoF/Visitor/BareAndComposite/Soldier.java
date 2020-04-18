package BehavioralPatterns.GoF.Visitor.BareAndComposite;

public interface Soldier {

    void printChainOfCommand();
    void accept(Visitor visitor);
}
