package TheClassics.CreationalPatterns.FactoryMethod.DeferredInstantiation2;

import TheClassics.CreationalPatterns.FactoryMethod.Models.*;

public abstract class DeferredParentFactory {

    public SimpleParent make() {
        /*
            This is a good demonstration of how Factories work.
            - We don't have any idea what is specifically going to be created, because that is decided by the
            subclasses.
            - However, we have an understanding of the interfaces, so we know what the objects are
            capable of doing.
         */
        System.out.println("Creating an object");


        SimpleParent object = create();
        object.doAction();
        object.doOtherAction();
        return object;
    }

    /*
        create() is a way for us to "defer" creation of the object to the subclasses.
     */
    public abstract SimpleParent create();
}
