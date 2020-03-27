package StructuralPatterns.TheClassics.Decorator.Common;

public class ConcreteComponent extends Component {

    /*
        This is the concrete implementation.
        - The implementation of the standard functionality announces that it is closed for modification. This
        means we want to create a pattern that won't impact this.
     */
    @Override
    public void method() {
       System.out.println("I am the Component's normal functionality, method(). I am closed for modification.");
    }
}
