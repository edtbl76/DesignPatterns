package CreationalPatterns.GoF.Builder.NoDirectorExample;

import CreationalPatterns.GoF.Builder.Model.*;

public class Launcher {

    public static void main(String[] args) {

        /*
            There is no director in this example. Instead we've adjusted the API and implementation to
            provide a default implementation as well as the ability to override it.
         */
        final ComplexObjectClass defaultObject =
                new ConcreteBuilder().assembleObject();
        System.out.println(defaultObject);

        /*
            This demonstrates two things.
                - 1 that we can create a builder and use it over and over if we wanted to to create multiple
                similar objects
                - 2 we can customize the builder!
         */
        ChainedBuilder customBuilder = new ConcreteBuilder();
        final ComplexObjectClass customObject1 =
                customBuilder
                        .start("Building a Custom Object")
                        .buildBase("redwood")
                        .addWidget("widg-e")
                        .insertDoohickeys(2)
                        .end("dishes are done, man!").assembleObject();
        System.out.println(customObject1);

        /*
            Demonstrate the reuse of a builder object to vary only the fields we want to.
            - This will create a NEW object, separate from the first one.
         */
        final ComplexObjectClass customObject2 =
                customBuilder
                        .start("Building another Custom Object")
                        .addWidget("E-widge")
                        .insertDoohickeys(3).assembleObject();
        System.out.println(customObject2);

        /*
            Demonstrate getting a constructed object.
            - NOTE: this gets the last object constructed.
         */
        final ComplexObjectClass copiedObject = customBuilder.getAssembledObject();
        System.out.println(copiedObject);



    }
}
