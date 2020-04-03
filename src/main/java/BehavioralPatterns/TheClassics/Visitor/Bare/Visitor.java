package BehavioralPatterns.TheClassics.Visitor.Bare;

public interface Visitor {

    /*
        This is the visitor's interface.
        NOTE: it explicitly only supports one kind of object.
     */
    void visit(ObjectToVisitImpl objectToVisit);
}
