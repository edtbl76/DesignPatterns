package TheClassics;

import TheClassics.Singleton.LazyInitialization1.*;
import TheClassics.Singleton.WhyWeUseFinal2.*;
import TheClassics.Singleton.EagerInitialization3.*;
import TheClassics.Singleton.NestedHelper4.*;
import org.junit.*;
import org.springframework.boot.test.system.*;

public class SingletonTests {

    // **** RULES ****
    @Rule
    public OutputCaptureRule output = new OutputCaptureRule();

    // **** TESTS ****

    /*
        Fairly straight forward.
        - create two references to our Singleton and than test that they are the same object.
     */
    @Test
    public void LazyInitializationTest() {
        LazySingleton s1 = LazySingleton.getSingleton();
        LazySingleton s2 = LazySingleton.getSingleton();

        Assert.assertEquals(s1, s2);
    }

    /*
        This tests the loophole of an Inner Class inside an attempted Singleton that wasn't declared as final.
        - our assertion exposes that calls to the nested inner class result in multiple instantiations, violating
        the "contract" of the Singleton design pattern.
     */
    @Test
    public void TestForFinal() {
        BadSingletonCanBeExtended s1 = BadSingletonCanBeExtended.getSingleton();
        Assert.assertEquals(BadSingletonCanBeExtended.getCounter(), 1);

        BadSingletonCanBeExtended s2 = BadSingletonCanBeExtended.getSingleton();
        Assert.assertEquals(BadSingletonCanBeExtended.getCounter(), 1);

        BadSingletonCanBeExtended.InnerSingleton s3 = s1.new InnerSingleton();
        Assert.assertEquals(BadSingletonCanBeExtended.getCounter(), 2);

    }

    /*
        This is a bit trickier.
        - Since the instantiation of the object is "anonymous", the counter variable is destroyed before we
        can access it.

        - In this particular case, we have the output statement that the instance counter hit 1 to latch onto.
        We can use Spring Boot's OutputCaptureRule to easily grab output.

        (I'm sure there are other ways to do this, but this one is pretty easy to use, terse w/ respect to
        readability, and it was the first thing that came to mind.)
     */
    @Test
    public void EagerInitializationTest() {
        EagerSingleton.runJob();
        Assert.assertTrue(output.getOut().contains("Instance Counter: 1"));
    }

    /*
        One good turn deserves another.
        We're testing Bill Pugh's version of a Singleton here which isolates static methods from the instatiation of
        the Singleton object through a nested "Helper" class.

        We just have to swap our assertion to "False" and if we want to be more accurate, we should search for any
        output that contains the "Instance Counter" statement in it.

     */
    @Test
    public void NestedHelperTest() {
        PughSingleton.runJob();
        Assert.assertFalse(output.getOut().contains("Instance Counter"));
    }




}
