package StructuralPatterns.NonGoF.NullObject.WithoutNullObject;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        String input = null;
        int totalObjects = 0;
        while (true) {
            System.out.println("Press 0 for Message, 1 for Event");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            Handler handler = null;

            switch(input) {
                case "0":
                    handler = new MessageHandler();
                    break;
                case "1":
                    handler = new EventHandler();
                    break;
            }
            totalObjects = EventHandler.count + MessageHandler.count;

            handler.execute();
            System.out.println("Total number of objects created: " + totalObjects);
        }
    }
}
