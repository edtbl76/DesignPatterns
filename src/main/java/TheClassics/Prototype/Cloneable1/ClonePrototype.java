package TheClassics.Prototype.Cloneable1;

import java.util.*;

public abstract class ClonePrototype implements Cloneable{

    private String model;
    private int cost, price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static int setRandomPrice() {
        int temp_price = 0;
        Random random = new Random();
        int placeholder = random.nextInt(100);
        temp_price = placeholder;
        return temp_price;
    }

    public ClonePrototype clone() throws CloneNotSupportedException {
        return (ClonePrototype)super.clone();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
