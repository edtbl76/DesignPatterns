package CreationalPatterns.TheClassics.FactoryMethod.SimpleFactoryMethod1;

import CreationalPatterns.TheClassics.FactoryMethod.Models.*;

public abstract class SimpleParentFactory {
    /*
        This is an abstract class for the Factory we are using to create the SimpleParent object.
     */
    public abstract SimpleParent createSimpleParent();
}