package BehavioralPatterns.TheClassics.Visitor.BareAndComposite;

public interface Visitor {
    void visit(Officer officer);
    void visit(Grunt grunt);
}
