package StructuralPatterns.TheClassics.Flyweight;

import java.util.*;

public class FlyweightFactory {

    static Map<String, SharedFlyweightInterface> flyweightFactory = new HashMap<>();
    public int creationCount() {
        return flyweightFactory.size();
    }

    public static synchronized SharedFlyweightInterface getObjectFromFactory(String type) throws Exception {
        SharedFlyweightInterface flyweightType = flyweightFactory.get(type);
        if (flyweightType == null) {
            switch (type) {
                case "One":
                    System.out.println("Creating Object Type One");
                    flyweightType = new SharedFlyweightOne();
                    break;
                case "Two":
                    System.out.println("Creating Object Type Two");
                    flyweightType = new SharedFlyweightTwo();
                    break;
                case "Three":
                    System.out.println("Creating Object Type Three");
                    flyweightType = new UnsharedFlyweightThree();
                    break;
                default:
                    throw new Exception("Unsupported Flyweight!");
            }
            flyweightFactory.put(type, flyweightType);
        } else {
            System.out.println("\t\t Using existing " + type + " of object");
        }
        return flyweightType;
    }
}
