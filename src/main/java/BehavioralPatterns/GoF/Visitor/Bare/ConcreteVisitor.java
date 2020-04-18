package BehavioralPatterns.GoF.Visitor.Bare;

public class ConcreteVisitor implements Visitor {

    /*
        The visit() method is really where we supply our "algorithm", which currently consists of
        squaring the number.
     */
    @Override
    public void visit(ObjectToVisitImpl objectToVisit) {
        System.out.println("Current value of our number is " + objectToVisit.getNumber());
        System.out.println("Visitor is VISITING YOU");
        System.out.println("Your Number is now " + objectToVisit.getNumber() * objectToVisit.getNumber());
        System.out.println("Be in awe of the power of the visitor.");
    }
}
