package TheClassics.FactoryMethod.Models;

public class SimpleClassTwo implements SimpleParent {

    /*
        This is an implementation of the SimpleParent interface.
     */
    @Override
    public void doAction() {
        System.out.println("Two");
    }

    @Override
    public void doOtherAction() {
        System.out.println("OtherTwo");
    }


}
