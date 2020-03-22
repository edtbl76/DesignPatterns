package CreationalPatterns.TheClassics.FactoryMethod.DeferredInstantiation2;

import CreationalPatterns.TheClassics.FactoryMethod.Models.*;

public class DeferredClassOneFactory extends DeferredParentFactory {

    /*
        This is the subclass of the Factory that decides what type of SimpleParent its going to create
     */

    @Override
    public SimpleParent create() {
        return new SimpleClassOne();
    }
}
