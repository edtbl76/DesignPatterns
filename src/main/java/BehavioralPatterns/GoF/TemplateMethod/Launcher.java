package BehavioralPatterns.GoF.TemplateMethod;

public class Launcher {

    public static void main(String[] args) {

        DesignPatterns bachelors = new BasicDesignPatterns();
        DesignPatterns masters = new AdvancedDesignPatterns();

        System.out.println("BACHELORS: ");
        bachelors.complete();

        System.out.println("MASTERS: ");
        masters.complete();
    }
}
