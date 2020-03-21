package TheClassics;

import TheClassics.Builder.AbstractBuilder2.*;
import TheClassics.Builder.InterfaceBuilder1.*;
import TheClassics.Builder.Model.*;
import TheClassics.Builder.NoDirectorExample.*;
import org.junit.*;
import org.springframework.boot.test.system.*;

import static org.junit.Assert.*;

@SuppressWarnings("deprecation")
public class BuilderTests {

    // **** RULES ****
    @Rule
    public OutputCaptureRule output = new OutputCaptureRule();

    // **** TESTS ****
    /*
        Yes, I know... I should be breaking down the tests further, but I'm organizing them in a manner that the
        are associated with the examples....Shut up.
     */
    @Test
    public void testInterfaceBuilder() {
        InterfaceDirector director = new InterfaceDirector();

        /*
            Create instance of ConcreteBuilder and test that I can access the name.
            - I did this because the getName() isn't available through the interface, so when we instantiate via
            Builder, we can't access the getName() method.
                (This is a demonstration of one possible way to  build in backdoors in the implementation of an API)
         */
        ConcreteBuilderOne cb1 = new ConcreteBuilderOne("fromImpl");
        assertEquals(cb1.getName(), "fromImpl");

        /*
            Build our object, print it out and check the output for each representation
         */
        InterfaceBuilder b1 = new ConcreteBuilderOne("fromInterface");
        director.build(b1);
        b1.getComplexObject().print();
        assertEquals(
                "ComplexObject: \n\tName[fromInterface]::ConcreteBase::Widgetarian::10-Doohickeys\n",
                output.getOut());

        output.reset();

        InterfaceBuilder b2 = new ConcreteBuilderTwo("fromInterface");
        director.build(b2);
        b2.getComplexObject().print();
        assertEquals(
                "ComplexObject: \n\tPavement::Widgetorious::42-Doohickeys::Name[fromInterface]\n",
                output.getOut());

    }

    @Test
    public void testAbstractBuilder() {
        output.reset();

        AbstractDirector director = new AbstractDirector();

        AbstractConcreteBuilderOne testBuilder = new AbstractConcreteBuilderOne("fromImpl");
        assertEquals(testBuilder.getName(), "fromImpl");

        AbstractBuilder b1 = new AbstractConcreteBuilderOne("fromInterface");
        director.build(b1);
        b1.getComplexObject().print();
        assertTrue(output.getOut().contains("<-[fromInterface]::concrete::Widgetron::Doohickey::[EOM]->"));

        AbstractBuilder b2 = new AbstractConcreteBuilderTwo("fromInterface");
        director.build(b2);
        b2.getComplexObject().print();
        assertTrue(output.getOut().contains("<-[fromInterface]::pavement::Widgetron::Doohickey::[MORE]->"));
    }

    @Test
    public void testDirectorlessBuilder() {
        output.reset();

        /*
            Test the getters
         */
        final ComplexObjectClass getterTest = new ConcreteBuilder().assembleObject();
        assertEquals(getterTest.getStartMessage(), "Building Thing One");
        assertEquals(getterTest.getObjectType(), "concrete");
        assertEquals(getterTest.getWidgetType(), "Widget Jr");
        assertEquals(getterTest.getNumberOfDoohickeys(), 37);
        assertEquals(getterTest.getEndMessage(), "Completing Thing One");

        /*
            Test to String.
         */
        final ComplexObjectClass co1 = new ConcreteBuilder().assembleObject();
        System.out.println(co1);
        assertEquals(
               "ComplexObjectClass{startMessage='Building Thing One', " +
                       "objectType='concrete', " +
                       "widgetType='Widget Jr', " +
                       "numberOfDoohickeys=37, " +
                       "endMessage='Completing Thing One'}\n", output.getOut()
        );
        output.reset();

        /*
            Test result after creation of custom builder.
         */
        ChainedBuilder cb = new ConcreteBuilder();
        final ComplexObjectClass co2 = cb
                .start("a")
                .buildBase("b")
                .addWidget("c")
                .insertDoohickeys(1)
                .end("d").assembleObject();
        System.out.println(co2);
        assertEquals(
                "ComplexObjectClass{startMessage='a', " +
                        "objectType='b', " +
                        "widgetType='c', " +
                        "numberOfDoohickeys=1, " +
                        "endMessage='d'}\n", output.getOut()
        );
        output.reset();

        /*
            Test getAssembled
        */
        System.out.println(cb.getAssembledObject());
        assertEquals(
                "ComplexObjectClass{startMessage='a', " +
                        "objectType='b', " +
                        "widgetType='c', " +
                        "numberOfDoohickeys=1, " +
                        "endMessage='d'}\n", output.getOut()
        );
    }
}
