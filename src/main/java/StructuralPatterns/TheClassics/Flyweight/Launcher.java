package StructuralPatterns.TheClassics.Flyweight;

import java.util.*;

public class Launcher {

    public static void main(String[] args) throws Exception {

        FlyweightFactory factory = new FlyweightFactory();
        SharedFlyweightInterface object;

        for (int i = 0; i < 3; i++) {
            object = FlyweightFactory.getObjectFromFactory("One");
            Thread.sleep(1000);
            object.getExtrinsicState(getRandomObjectNumber());
        }
        int numberOfDistinctObjects = factory.creationCount();
        System.out.println("Total distinct objects created: " + numberOfDistinctObjects);

        for (int i = 0; i < 5; i++) {
            object = FlyweightFactory.getObjectFromFactory("Two");
            Thread.sleep(1000);
            object.getExtrinsicState(getRandomObjectNumber());
        }
        numberOfDistinctObjects = factory.creationCount();
        System.out.println("Total distinct objects created: " + numberOfDistinctObjects);

        for (int i = 0; i < 4; i++) {
            object = FlyweightFactory.getObjectFromFactory("Three");
            Thread.sleep(1000);
            object.getExtrinsicState(getRandomObjectNumber());
        }
        numberOfDistinctObjects = factory.creationCount();
        System.out.println("Total distinct objects created: " + numberOfDistinctObjects);
    }

    private static String getRandomObjectNumber() {
        Random random = new Random();
        int r = random.nextInt();
        if (r % 2 == 0)
            return "hello";
        else
            return "world";
    }



}
