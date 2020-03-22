package TheClassics;

import CreationalPatterns.TheClassics.Prototype.Cloneable1.*;
import CreationalPatterns.TheClassics.Prototype.Copyable2.*;
import org.junit.*;
import org.springframework.boot.test.system.*;

import static org.junit.Assert.*;

public class PrototypeTests {

    // **** RULES ****
    @Rule
    public OutputCaptureRule output = new OutputCaptureRule();

    // **** TESTS ****
    @Test
    public void testCloneablePrototype() throws CloneNotSupportedException {

        /*
            Create an instanceof each model, and test that we can retrieve their names w/ correctness
         */
        ClonePrototype cm1 = new CloneModelOne("cm1");
        ClonePrototype cm2 = new CloneModelTwo("cm2");

        assertEquals(cm1.getModel(), "cm1");
        assertEquals(cm2.getModel(), "cm2");

        /*
            Set cost and confirm correctness
         */
        cm1.setCost(100);
        cm2.setCost(150);

        assertEquals(cm1.getCost(), 100);
        assertEquals(cm2.getCost(), 150);

        /*
            Create random values we'll need to use to inject into the test statements below.
         */
        int price1 = cm1.getCost() + ClonePrototype.setRandomPrice();
        int price2 = cm2.getCost() + ClonePrototype.setRandomPrice();

        /*
            "Send in the Clones", "Attack of the Clones" :)
         */
        ClonePrototype p1 = cm1.clone();
        ClonePrototype p2 = cm2.clone();

        /*
            Set and Test our prices
         */
        p1.setPrice(price1);
        p2.setPrice(price2);

        assertEquals(p1.getPrice(), price1);
        assertEquals(p2.getPrice(), price2);

    }

    @SuppressWarnings("deprecation")
    @Test
    public void testCopyPrototype() {

        /*
            Create new object and tests accessors.
         */
        CopyPrototype cp1 = new CopyPrototype(1, "one");
        assertEquals(cp1.getSerialNumber(), 1);
        assertEquals(cp1.getModel(), "one");

        /*
            Test the print() method
         */
        cp1.print();
        assertEquals("Model: one S/N: 1\n", output.getOut());


        /*
            This is deprecated and there is no replacement as of yet. This resets my capture output so I can cleanly
            use it to retest.
         */
        output.reset();

        /*
            Test copy constructor and retest the accessors
         */
        CopyPrototype copied = new CopyPrototype(cp1);
        assertEquals(copied.getSerialNumber(), 1);
        assertEquals(copied.getModel(), "one");

        /*
            Test the print() method from the copied object.
         */
        copied.print();
        assertEquals("Model: one S/N: 1\n", output.getOut());
    }
}
