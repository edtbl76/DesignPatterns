package CreationalPatterns.GoF.Singleton.EagerInitialization3;

@SuppressWarnings("unused")
public class EagerSingleton {

    /*
        - Making this final prevents it from being changed.
        - making it static ensures that it is instantiated when the program starts.
     */
    private final static EagerSingleton singleton = new EagerSingleton();
    private static int counter = 0;

    /*
        The purpose of the private constructor is to prevent dynamic instantiation (i.e. no "new" keyword).
     */
    private EagerSingleton() {

        counter++;
        System.out.println("Instance Counter: " + counter);
        System.out.println("Creating single instance of singleton");
    }

    /*
        This is the accessor
     */
    public static EagerSingleton getSingleton() {

        System.out.println("Not allowed to create more than one instance of a singleton.");
        return singleton;
    }

    public static void runJob() {
        System.out.println("Running an important job");
    }
}
