package StructuralPatterns.GoF.Proxy.ProtectionProxy;

public class ConcreteSubject extends AbstractSubject {
    @Override
    public void method() {
        System.out.println("Calling all methods!");
    }
}
