package StructuralPatterns.TheClassics.Flyweight;

public class SharedFlyweightTwo implements SharedFlyweightInterface{

    /*
        Intrinsic State
            - not supplied by client
            - independent of the flyweight's context
            - this can be shared across multiple objects
            - usually immutable
     */
    private final String objectTypeCreated;

    public SharedFlyweightTwo() {
        objectTypeCreated = "Shared Flyweight Two (This is intrinsic state)";
        System.out.print(objectTypeCreated);
    }


    @Override
    public void getExtrinsicState(String state) {
        System.out.print(" with extrinsic state [" + state + "]");
    }
}
