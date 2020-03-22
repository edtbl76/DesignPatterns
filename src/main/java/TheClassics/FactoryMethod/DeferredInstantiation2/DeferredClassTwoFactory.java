package TheClassics.FactoryMethod.DeferredInstantiation2;

import TheClassics.FactoryMethod.Models.*;
import TheClassics.FactoryMethod.SimpleFactoryMethod1.*;

public class DeferredClassTwoFactory extends DeferredParentFactory {

    @Override
    public SimpleParent create() {
       return new SimpleClassTwo();
    }
}
