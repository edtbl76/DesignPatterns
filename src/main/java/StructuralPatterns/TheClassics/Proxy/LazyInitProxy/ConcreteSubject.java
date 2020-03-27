package StructuralPatterns.TheClassics.Proxy.LazyInitProxy;

public class ConcreteSubject extends AbstractSubject {

    /*
        This is the Concrete Subject. This is the implementation of the object that we actually want to create.
        - Even though this is just a print statement, we want to consider real world use cases.

        This is going to be some super secure code that we don't want a user to access,

        or it is separated by design/functional boundaries (i.e. maybe a 3rd party SDK?).

        or it is just a super complicated expensive setup process (like creating a processor thread or setting up
        database connections, or some other super complicated process that we don't want ot have to look at or
        navigate.
     */

    static int counter = 0;
    @Override
    public void method() {
        if (counter == 0) {
            System.out.println("method() called for first time, lazily loading object.");
        }
        System.out.println("method() is being called inside the ConcreteSubject [" + counter++ + "]");
    }
}
