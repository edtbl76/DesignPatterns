package TheClassics.CreationalPatterns.Singleton.WhyWeUseFinal2;

public class Launcher {

    public static void main(String[] args) {

        /*
            NOTE: we are accessing the Singleton statically, because its constructor is private.

                We can't do this:
                    Singleton_1 singleton = new Singleton_1();
         */
        System.out.println("Trying to create a singleton!");
        BadSingletonCanBeExtended singleton = BadSingletonCanBeExtended.getSingleton();

        /*
            Create another reference, but this won't create a new instance.
         */
        System.out.println("Trying to create another one");
        BadSingletonCanBeExtended anotherSingleton = BadSingletonCanBeExtended.getSingleton();

        /*
            We implemented an instance counter in our Singleton to demonstrate what is going on here.
            1.) We created an nested non-static inner class that is capable of extending the outer class.
                - this only works if the FINAL keyword isn't provided.
            2.) We have created a broken Singleton that can be instantiated more than once.
                - This is why it is considered best practices to make a class FINAL to prevent it from
                being inherited.
         */
        BadSingletonCanBeExtended.InnerSingleton innerSingleton = singleton.new InnerSingleton();
    }




}
