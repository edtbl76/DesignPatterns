package CreationalPatterns.TheClassics.FactoryMethod.DeferredInstantiation2;

import CreationalPatterns.TheClassics.FactoryMethod.Models.*;

public class DeferredClassTwoFactory extends DeferredParentFactory {

    @Override
    public SimpleParent create() {
       return new SimpleClassTwo();
    }
}
