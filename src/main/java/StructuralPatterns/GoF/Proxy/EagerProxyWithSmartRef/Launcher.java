package StructuralPatterns.GoF.Proxy.EagerProxyWithSmartRef;

public class Launcher {

    public static void main(String[] args) {

        /*
            First note is that the initialization of the Subject is happening at the same time we create a new
            proxy object.
            - This demonstrates eagerly loading the object... which suggests that the cost of creating the object
            is trivial, and we have some other purpose. (Remote?)
         */
        System.out.println(" --- init #1 --- ");
        EagerProxy proxy = new EagerProxy();

        /*
            Our first call is going to get run our super duper method() and we're going to get our ObjectCount.
         */
        System.out.println(" --- Call #1 ---");
        proxy.method();
        System.out.println("\tObjects: " +  EagerProxy.getCount());

        /*
            In the previous example,
            we used a counter inside the ConcreteSubject to track the number of times the SAME OBJECT was called.
                - this was a demonstration of using static space.

            In THIS example, we're using the counter inside the proxy as a smart reference/accumulator to count
            how many objects we've created. (maybe we want this for metrics/tracing/whatever)

            Since we're calling the same object... the object count doesn't change.
         */
        System.out.println(" --- Call #2 ---");
        proxy.method();
        System.out.println("Objects: " +  EagerProxy.getCount());

        /*
            Let's create a second object.
         */
        System.out.println(" --- init #2 ---");
        EagerProxy anotherProxy = new EagerProxy();


        /*
            Our object counter increases here, because we've created a new object. If you recall, in the previous
            example we had a null check that only used the "new" keyword if the object already existed. In this case,
            our constructor called new every time we created a new instance of EagerProxy.

            This means that rather than having a many-to-one relationship between proxies and the concrete object,
            we have a 1:1 relationship between proxies and the concrete object.

            I'll say this again.. think of these use cases in terms of serialized and concurrent workflows. You'll
            also want to consider these patterns based on use case (how often are the objects used? Is there state in
            the objects that can change?)
         */
        System.out.println(" --- Call #1 ---");
        anotherProxy.method();
        System.out.println("\tObjects: " +  EagerProxy.getCount());
    }
}
