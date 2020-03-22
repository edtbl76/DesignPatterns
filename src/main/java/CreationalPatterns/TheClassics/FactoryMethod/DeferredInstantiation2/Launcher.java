package CreationalPatterns.TheClassics.FactoryMethod.DeferredInstantiation2;

import CreationalPatterns.TheClassics.FactoryMethod.Models.*;

public class Launcher {

    public static void main(String[] args) {

        /*
            This is a very lean "client" so to speak.
            If you look at the output, everything is happening "somewhere else".
         */
        DeferredParentFactory classOneFactory = new DeferredClassOneFactory();
        SimpleParent classOne = classOneFactory.make();

        DeferredParentFactory classTwoFactory = new DeferredClassTwoFactory();
        SimpleParent classTwo = classTwoFactory.make();

    }
}
