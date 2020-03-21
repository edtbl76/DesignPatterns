package TheClassics.Builder.CommonImpl;

import java.util.*;

public class Launcher {

    public static void main(String[] args) {

        /*
            Instantiate director and our ConcreteBuilders.
         */
        Director director = new Director();
        Builder cb1 = new ConcreteBuilderOne("CBOne");
        Builder cb2 = new ConcreteBuilderTwo("CBTwo");

        /*
            Build the ComplexObject and print out the result.
         */
        Arrays.asList(cb1, cb2).forEach(builder -> {
            director.build(builder);
            builder.getComplexObject().print();
        });

    }
}
