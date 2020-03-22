package CreationalPatterns.TheClassics.FactoryMethod.Models;

public class SimpleClassOne implements SimpleParent {

    /*
        This is an implementation of the SimpleParent interface.
     */

    @Override
    public void doAction() {
        System.out.println("One");
    }

    @Override
    public void doOtherAction() {
        System.out.println("OtherOne");
    }
}
