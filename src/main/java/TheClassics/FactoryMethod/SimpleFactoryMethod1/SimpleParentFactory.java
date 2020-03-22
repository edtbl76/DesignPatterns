package TheClassics.FactoryMethod.SimpleFactoryMethod1;

import TheClassics.FactoryMethod.Models.*;

public abstract class SimpleParentFactory {
    /*
        This is an abstract class for the Factory we are using to create the SimpleParent object.
     */
    public abstract SimpleParent createSimpleParent();
}