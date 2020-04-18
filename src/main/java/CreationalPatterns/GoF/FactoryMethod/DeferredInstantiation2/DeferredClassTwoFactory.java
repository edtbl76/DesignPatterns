package CreationalPatterns.GoF.FactoryMethod.DeferredInstantiation2;

import CreationalPatterns.GoF.FactoryMethod.Models.*;

public class DeferredClassTwoFactory extends DeferredParentFactory {

    @Override
    public SimpleParent create() {
       return new SimpleClassTwo();
    }
}
