package StructuralPatterns.GoF.Proxy.EagerProxyWithSmartRef;

import StructuralPatterns.GoF.Proxy.LazyInitProxy.*;

public class ConcreteSubject extends AbstractSubject {

    /*
        Simpler implementation of the Concrete Subject.
     */

    @Override
    public void method() {
        System.out.println("method() is being called inside the ConcreteSubject");
    }
}
