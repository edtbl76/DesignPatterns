package TheClassics.CreationalPatterns.Singleton.NestedHelper4;

public class PughSingleton {

    private static int counter = 0;

    private PughSingleton() {
        System.out.println("Creating a Singleton");
    }

    public static int getCounter() {
        return counter;
    }

    private static class SingletonHelper {
        private static final PughSingleton singleton = new PughSingleton();
    }

    public static PughSingleton getSingleton() {
        counter++;
        System.out.println("Creating a new Singleton");
        return SingletonHelper.singleton;
    }

    public static void runJob() {
        System.out.println("Running an important job.");
    }
}
