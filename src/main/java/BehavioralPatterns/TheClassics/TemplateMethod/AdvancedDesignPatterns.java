package BehavioralPatterns.TheClassics.TemplateMethod;

public class AdvancedDesignPatterns extends DesignPatterns {
    @Override
    public void completeFinalProject() {
        System.out.println("Completing PostGradudate Final Project on Design Patterns.");
        System.out.println("Implementing one application with all design patterns");
    }

    // I'm not an undergrad, so I'm OPTIONALLY overriding this method.
    @Override
    boolean isUndergrad() {
        return false;
    }
}
