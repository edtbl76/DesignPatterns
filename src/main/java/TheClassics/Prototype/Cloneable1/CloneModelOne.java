package TheClassics.Prototype.Cloneable1;

public class CloneModelOne extends ClonePrototype {

    private int cost = 100000;

    public CloneModelOne(String model) {
        setModel(model);
    }

    @Override
    public ClonePrototype clone() throws CloneNotSupportedException {
        return (CloneModelOne)super.clone();
    }

    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
