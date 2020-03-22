package TheClassics.CreationalPatterns.FactoryMethod.DeferredInstantiation2;

import TheClassics.CreationalPatterns.FactoryMethod.Models.*;

public class DeferredClassTwoFactory extends DeferredParentFactory {

    @Override
    public SimpleParent create() {
       return new SimpleClassTwo();
    }
}
