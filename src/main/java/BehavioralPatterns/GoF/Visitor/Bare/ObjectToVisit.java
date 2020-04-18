package BehavioralPatterns.GoF.Visitor.Bare;

public interface ObjectToVisit {

    /*
        Interface for the object we want to DoTheThing to.
     */
    void accept(Visitor visitor);
}
