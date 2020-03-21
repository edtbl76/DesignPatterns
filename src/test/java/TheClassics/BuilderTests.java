package TheClassics;

import TheClassics.Builder.CommonImpl.*;
import TheClassics.Prototype.Cloneable1.*;
import TheClassics.Prototype.Copyable2.*;
import org.junit.*;
import org.springframework.boot.test.system.*;

public class BuilderTests {

    // **** RULES ****
    @Rule
    public OutputCaptureRule output = new OutputCaptureRule();

    // **** TESTS ****
    @Test
    public void testCommonBuilderImplementation() {
        Director director = new Director();

        /*
            Create instance of ConcreteBuilder and test that I can access the name.
            - I did this because the getName() isn't available through the interface, so when we instantiate via
            Builder, we can't access the getName() method.
                (This is a demonstration of one possible way to  build in backdoors in the implementation of an API)
         */
        ConcreteBuilderOne cb1 = new ConcreteBuilderOne("fromImpl");
        Assert.assertEquals(cb1.getName(), "fromImpl");

        /*
            Build our object, print it out and check the output for each representation
         */
        Builder b1 = new ConcreteBuilderOne("fromInterface");
        director.build(b1);
        b1.getComplexObject().print();
        Assert.assertEquals(
                "ComplexObject: \n\tName[fromInterface]::ConcreteBase::Widgetarian::10-Doohickeys\n",
                output.getOut());

        output.reset();

        Builder b2 = new ConcreteBuilderTwo("fromInterface");
        director.build(b2);
        b2.getComplexObject().print();
        Assert.assertEquals(
                "ComplexObject: \n\tPavement::Widgetorious::42-Doohickeys::Name[fromInterface]\n",
                output.getOut());

    }


}
