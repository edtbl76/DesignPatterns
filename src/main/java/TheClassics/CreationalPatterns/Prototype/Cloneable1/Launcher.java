package TheClassics.CreationalPatterns.Prototype.Cloneable1;

import java.util.*;

public class Launcher {

    public static void main(String[] args) throws CloneNotSupportedException {

        ClonePrototype modelOne = new CloneModelOne("Widget");
        ClonePrototype modelTwo = new CloneModelTwo("Doohickey");

        modelOne.setCost(100);
        modelTwo.setCost(200);

        ClonePrototype p1 = modelOne.clone();
        ClonePrototype p2 = modelTwo.clone();

        p1.setPrice(modelOne.getCost() + ClonePrototype.setRandomPrice());
        p2.setPrice(modelTwo.getCost() + ClonePrototype.setRandomPrice());

        for (ClonePrototype p : Arrays.asList(p1, p2)) {
            System.out.println("A " + p.getModel() + " sells for $" + p.getPrice() + ".00");
        }

    }
}
