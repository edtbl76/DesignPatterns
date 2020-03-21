package TheClassics.Singleton.LazyInitialization1;

/*
    This is final to prevent inheritance
 */
public final class LazySingleton {

    private static LazySingleton singleton;

    // Private Constructor
    private LazySingleton() {}

    /*
        We're using synchronized as a thread safety measure
        - yes this adds overhead, but it also prevents a race condition that would
        allow multiple Singleton's to be created

            i.e. Thread 2 evaluates null shortly after Thread 1 which is in between
            "evaluating null" and instantiating a new Singleton()
     */
    public static synchronized LazySingleton getSingleton() {

        /*
            This is an example of Lazy initialization.
            - The purpose is to delay the initialization of an object until it is
            needed.
         */
        if (singleton == null) {
            singleton = new LazySingleton();
            System.out.println("Creating single instance of singleton");
        } else {
            System.out.println("Not allowed to create more than one instance of a singleton.");
        }
        return singleton;
    }
}
