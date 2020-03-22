package TheClassics.CreationalPatterns.FactoryMethod.SimpleFactoryMethod1;

import TheClassics.CreationalPatterns.FactoryMethod.Models.*;

public class SimpleClassOneFactory extends SimpleParentFactory {

    /*
        This is the subclass of the Factory that decides what type of SimpleParent its going to create
     */
    @Override
    public SimpleParent createSimpleParent() {
        return new SimpleClassOne();
    }
}
