package StructuralPatterns.TheClassics.Proxy.EagerProxyWithSmartRef;


import StructuralPatterns.TheClassics.Proxy.LazyInitProxy.*;

public class EagerProxy extends AbstractSubject {

    private static AbstractSubject subject;
    private static int count = 0;           // <-- smart reference!!!!

    /*
        In the previous example we lazy loaded the object.
        In this case, let's assume that the cost of the object isn't as much of a concern, so eager loading is ok.
        - We've added an accumulator here that will do some work.
     */
    public EagerProxy() {
        subject = new ConcreteSubject();
        count++;
        System.out.println("Proxy Initialized eagerly.");
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void method() {
        System.out.println("Proxy calling ConcreteSubject...");
        subject.method();
    }
}
