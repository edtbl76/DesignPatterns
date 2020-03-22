package TheClassics.CreationalPatterns.Prototype.Cloneable1;

public class CloneModelTwo extends ClonePrototype {

    private int cost = 100000;

    public CloneModelTwo(String model) {
        setModel(model);
    }

    @Override
    public ClonePrototype clone() throws CloneNotSupportedException {
        return (CloneModelTwo) super.clone();
    }

    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
