package CreationalPatterns.GoF.FactoryMethod.SimpleFactoryMethod1;

import CreationalPatterns.GoF.FactoryMethod.Models.*;

public abstract class SimpleParentFactory {
    /*
        This is an abstract class for the Factory we are using to create the SimpleParent object.
     */
    public abstract SimpleParent createSimpleParent();
}