package CreationalPatterns.GoF.Singleton.NestedHelper4;

@SuppressWarnings("unused")
public class PughSingleton {


    private PughSingleton() {
        System.out.println("Creating a Singleton");
    }

    private static class SingletonHelper {
        private static final PughSingleton singleton = new PughSingleton();
    }

    public static PughSingleton getSingleton() {
        System.out.println("Creating a new Singleton");
        return SingletonHelper.singleton;
    }

    public static void runJob() {
        System.out.println("Running an important job.");
    }
}
