package TheClassics;

import TheClassics.Builder.AbstractBuilder2.*;
import TheClassics.Builder.InterfaceBuilder1.*;
import org.junit.*;
import org.springframework.boot.test.system.*;

import static org.junit.Assert.*;

public class BuilderTests {

    // **** RULES ****
    @Rule
    public OutputCaptureRule output = new OutputCaptureRule();

    // **** TESTS ****
    @SuppressWarnings("deprecation")
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

    }
}
