package StructuralPatterns.TheClassics.Proxy.EagerProxyWithSmartRef;

import StructuralPatterns.TheClassics.Proxy.LazyInitProxy.*;

public class ConcreteSubject extends AbstractSubject {

    /*
        Simpler implementation of the Concrete Subject.
     */

    @Override
    public void method() {
        System.out.println("method() is being called inside the ConcreteSubject");
    }
}
