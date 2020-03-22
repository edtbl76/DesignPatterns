package CreationalPatterns.TheClassics.Builder.AbstractBuilder2;


import java.util.*;

public class Launcher {

    public static void main(String[] args) {

        /*
            Instantiate director and our ConcreteBuilders.
         */
        AbstractDirector director = new AbstractDirector();
        AbstractBuilder cb1 = new AbstractConcreteBuilderOne("CBOne");
        AbstractBuilder cb2 = new AbstractConcreteBuilderTwo("CBTwo");

        /*
            Build the ComplexObject and print out the result.
         */
        Arrays.asList(cb1, cb2).forEach(builder -> {
            director.build(builder);
            builder.getComplexObject().print();
        });

    }
}
