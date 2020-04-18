package StructuralPatterns.GoF.Flyweight;

public class SharedFlyweightOne implements SharedFlyweightInterface{

    /*
        Intrinsic State
            - not supplied by client
            - independent of the flyweight's context
            - this can be shared across multiple objects
            - usually immutable
     */
    private final String objectTypeCreated;

    public SharedFlyweightOne() {
        objectTypeCreated = "Shared Flyweight One (This is intrinsic state)";
        System.out.print(objectTypeCreated);
    }


    @Override
    public void getExtrinsicState(String state) {
        System.out.print(" with extrinsic state [" + state + "]");
    }
}
