package StructuralPatterns.NonGoF.NullObject.WithNullObject;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        String input = "Hello World";
        int totalObjects = 0;
        Scanner scanner;


        // This allows us to keep running until we want to exit.
        // More robust implementation
        while (!input.toLowerCase().contains("exit")) {

            System.out.println("Press 0 for Message, 1 for Event");
            scanner = new Scanner(System.in);

            // If there is input get it.
            if (scanner.hasNextLine())
                input = scanner.nextLine();

            Handler handler = null;

            switch(input) {
                case "0":
                    handler = new MessageHandler();
                    break;
                case "1":
                    handler = new EventHandler();
                    break;
                case "exit":
                    System.out.println("Shutting down");
                    handler = NullHandler.getInstance();
                    break;
                default:
                    System.out.println("Invalid input");
                    handler = NullHandler.getInstance();
            }

            totalObjects = EventHandler.count + MessageHandler.count + NullHandler.count;

            // No need for null check.
            handler.execute();
            System.out.println("Total number of objects created: " + totalObjects);
        }
    }
}
