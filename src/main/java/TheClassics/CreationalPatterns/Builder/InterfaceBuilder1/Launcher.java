package TheClassics.CreationalPatterns.Builder.InterfaceBuilder1;

import java.util.*;

public class Launcher {

    public static void main(String[] args) {

        /*
            Instantiate director and our ConcreteBuilders.
         */
        InterfaceDirector director = new InterfaceDirector();
        InterfaceBuilder cb1 = new ConcreteBuilderOne("CBOne");
        InterfaceBuilder cb2 = new ConcreteBuilderTwo("CBTwo");

        /*
            Build the ComplexObject and print out the result.
         */
        Arrays.asList(cb1, cb2).forEach(builder -> {
            director.build(builder);
            builder.getComplexObject().print();
        });

    }
}
