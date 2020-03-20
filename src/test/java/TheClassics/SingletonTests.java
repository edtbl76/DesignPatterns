package TheClassics;

import TheClassics.Singleton.Example1.*;
import TheClassics.Singleton.Example2.*;
import TheClassics.Singleton.Example3.*;
import org.junit.*;

public class SingletonTests {

    @Test
    public void testExample1() {
        LazySingleton s1 = LazySingleton.getSingleton();
        LazySingleton s2 = LazySingleton.getSingleton();

        Assert.assertEquals(s1, s2);
    }

    @Test
    public void testExample2() {
        BadSingletonCanBeExtended s1 = BadSingletonCanBeExtended.getSingleton();
        Assert.assertEquals(BadSingletonCanBeExtended.counter, 1);

        BadSingletonCanBeExtended s2 = BadSingletonCanBeExtended.getSingleton();
        Assert.assertEquals(BadSingletonCanBeExtended.counter, 1);

        BadSingletonCanBeExtended.InnerSingleton s3 = s1.new InnerSingleton();
        Assert.assertEquals(BadSingletonCanBeExtended.counter, 2);

    }

    @Test
    public void testExample3() {
        EagerSingleton.runJob();
        EagerSingleton s1 = EagerSingleton.getSingleton();
        EagerSingleton s2 = EagerSingleton.getSingleton();

        Assert.assertEquals(s1, s2);
    }


}
