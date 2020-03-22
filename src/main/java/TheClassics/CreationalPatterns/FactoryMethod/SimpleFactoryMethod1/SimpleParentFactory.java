package TheClassics.CreationalPatterns.FactoryMethod.SimpleFactoryMethod1;

import TheClassics.CreationalPatterns.FactoryMethod.Models.*;

public abstract class SimpleParentFactory {
    /*
        This is an abstract class for the Factory we are using to create the SimpleParent object.
     */
    public abstract SimpleParent createSimpleParent();
}