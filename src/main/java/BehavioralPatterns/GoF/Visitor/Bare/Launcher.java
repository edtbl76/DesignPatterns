package BehavioralPatterns.GoF.Visitor.Bare;

public class Launcher {
    public static void main(String[] args) {

        Visitor visitor = new ConcreteVisitor();
        ObjectToVisitImpl object = new ObjectToVisitImpl();
        object.accept(visitor);
    }
}
