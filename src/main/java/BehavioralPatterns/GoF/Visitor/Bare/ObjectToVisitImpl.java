package BehavioralPatterns.GoF.Visitor.Bare;

public class ObjectToVisitImpl implements ObjectToVisit {

    /*
        This is just the implementation of the object we
        want to DoTheThing to.

        The noteworthy part is that there is no business logic.
        This is just a constructor, a getter to an immutable object, and the acceptor().

        The accept method fulfills the interface's method contract.
     */
    private final int number;

    public ObjectToVisitImpl() {
        number = 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getNumber() {
        return number;
    }
}
