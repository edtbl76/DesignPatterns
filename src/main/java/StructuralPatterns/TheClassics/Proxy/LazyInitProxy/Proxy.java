package StructuralPatterns.TheClassics.Proxy.LazyInitProxy;

public class Proxy extends AbstractSubject {

    /*
        This is static so we always have the same instance of the object.
     */
    static AbstractSubject subject;

    @Override
    public void method() {

        // This is just a marker to remind us that we're inside the proxy.
        System.out.println("Proxy initialized.");

        /*
            This is lazy. No really, it's lazy initialization.
            This code block checks for null, which means that we won't create an actual instance of the object
            until method() is called for the first time.

            However, since we defined the var as static above, any subsequent calls to method will return the same
            object.

            Even if we create new instances of the Proxy object, we'll end up with the same reference to the
            ConcreteSubject, because the variable is static. If we removed the null check, then we'd actually end up
            with a new instance each time.

         */
        if (subject == null)
            subject = new ConcreteSubject();
        subject.method();

    }
}
