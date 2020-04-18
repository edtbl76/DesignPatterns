package StructuralPatterns.GoF.Proxy.LazyInitProxy;

public class Launcher {

    public static void main(String[] args) {

        /*
            This is our client code. It's hit all of the major buttons.
            - we're calling method(), which is the method() from the intended object ("The Subject") that we
            want to call. The fact that this method is actually the method() member of the Proxy is only evident
            because we built the Proxy object, but the functionality is the same, so the end result is
            transparent to the user.

            - The proxy method is going to load it lazily on our behalf the first time.

         */
        Proxy proxy = new Proxy();

        System.out.println("--- Call #1 ---");
        proxy.method();

        /*
            I added a counter to the concrete method (and its output)
            to count the number of times we've called the object.
         */
        System.out.println("--- Call #2 ---");
        proxy.method();

        /*
            Let's create a second object.
         */
        System.out.println(" --- init #2 ---");
        Proxy anotherProxy = new Proxy();

        /*
            NOTE: When we call this the counter increments again!
            This is because Proxy holds a static reference to the ConcreteSubject and we are checking whether or not
            that reference is present.

            static variables are shared by all objects of the class. This means that if I create 100 instances of
            Proxy, they are all going to reference the same object.

            (Think about this use case in terms of serialized or concurrent workflows....)

         */
        System.out.println(" --- Call #1 ---");
        anotherProxy.method();
    }
}
