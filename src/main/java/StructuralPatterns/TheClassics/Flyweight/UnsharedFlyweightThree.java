package StructuralPatterns.TheClassics.Flyweight;

public class UnsharedFlyweightThree implements SharedFlyweightInterface{

    /*
        Intrinsic State
            - not supplied by client
            - independent of the flyweight's context
            - this can be shared across multiple objects
            - usually immutable
     */
    private final String objectTypeCreated;

    public UnsharedFlyweightThree() {
        objectTypeCreated = "Shared Flyweight Three (This is intrinsic state)";
        System.out.print(objectTypeCreated);
    }


    /*
        Since this is an unshared flyweight,
        we ignore the extrinsic state argument.
     */
    @Override
    public void getExtrinsicState(String state) {
        System.out.print(" with extrinsic state [DEFAULT]");
    }
}
