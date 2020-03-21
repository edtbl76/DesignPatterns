package TheClassics.Singleton.DoubleCheckedLocking5;

public final class DCLSingleton {

    private static DCLSingleton singleton;
    private static int counter;


    public static int getCounter() {
        return counter;
    }

    private DCLSingleton() {
        counter++;
        System.out.println("Instance Counter: " + counter);
    }

    public static DCLSingleton getSingleton() {

        if (singleton == null) {
            synchronized (DCLSingleton.class) {

                if (singleton == null) {
                    singleton = new DCLSingleton();
                    System.out.println("Instantiating the Singleton");
                } else {
                    System.out.println("Only one instance of a Singleton can be instantiated.");
                }
            }
        }
        return singleton;
    }

}
