package CreationalPatterns.TheClassics.Singleton.LazyInitialization1;

@SuppressWarnings("unused")
public class Launcher {

    public static void main(String[] args) {




        /*
            NOTE: we are accessing the Singleton statically, because its constructor is private.

                We can't do this:
                    Singleton_1 singleton = new Singleton_1();
         */
        System.out.println("Trying to create a singleton!");
        LazySingleton singleton = LazySingleton.getSingleton();

        /*
            Create another reference, but this won't create a new instance.
         */
        System.out.println("Trying to create another one");
        LazySingleton anotherSingleton = LazySingleton.getSingleton();

    }



}
