package CreationalPatterns.TheClassics.Prototype.Cloneable1;

@SuppressWarnings("EmptyMethod")
public class CloneModelOne extends ClonePrototype {

    private int cost = 100000;

    public CloneModelOne(String model) {
        setModel(model);
    }

    /*
        This actually isn't necessary.

        return super.methodCall() is the same thing as using the parent/superclass implementation. If you comment this
        out, you'll find it works the same.
     */
    @Override
    public ClonePrototype clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
