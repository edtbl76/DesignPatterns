package TheClassics.Singleton.Example2;

/*
    This isn't final this time.
 */
public class BadSingletonCanBeExtended {

    private static BadSingletonCanBeExtended singleton;
    public static int counter = 0;

    /*
        This is still private.
     */
    private BadSingletonCanBeExtended() {

        /*
            We're building an internal counter to determine if this is
            TRULY a singleton
         */
        counter++;
        System.out.println("Instance Counter: " + counter);
    }

    public static synchronized BadSingletonCanBeExtended getSingleton() {

        if (singleton == null) {
            singleton = new BadSingletonCanBeExtended();
            System.out.println("Creating single instance of singleton");
        } else {
            System.out.println("Not allowed to create more than one instance of a singleton.");
        }
        return singleton;
    }

    public class InnerSingleton extends BadSingletonCanBeExtended {

    }
}
