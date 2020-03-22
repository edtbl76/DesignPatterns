package TheClassics;

import TheClassics.FactoryMethod.DeferredInstantiation2.*;
import TheClassics.FactoryMethod.Models.*;
import TheClassics.FactoryMethod.SimpleFactoryMethod1.*;
import org.junit.*;
import org.springframework.boot.test.system.*;

import static org.junit.Assert.*;

@SuppressWarnings("deprecation")
public class FactoryMethodTests {

    // **** RULES ****
    @Rule
    public OutputCaptureRule output = new OutputCaptureRule();

    // **** TESTS ****
    @Test
    public void testSimpleFactoryMethod() {
        SimpleParentFactory classOne = new SimpleClassOneFactory();
        SimpleParent classOneInstance = classOne.createSimpleParent();

        classOneInstance.doAction();
        assertEquals("One\n", output.getOut());
        output.reset();

        classOneInstance.doOtherAction();
        assertEquals("OtherOne\n", output.getOut());
    }

    @Test
    public void testDeferredInstance() {
        output.reset();
        DeferredParentFactory classOneFactory = new DeferredClassOneFactory();
        SimpleParent classOne = classOneFactory.make();
        assertEquals("Creating an object\nOne\nOtherOne\n", output.getOut());

        output.reset();
        DeferredParentFactory classTwoFactory = new DeferredClassTwoFactory();
        SimpleParent classTwo = classTwoFactory.make();
        assertEquals("Creating an object\nTwo\nOtherTwo\n", output.getOut());

    }
}

