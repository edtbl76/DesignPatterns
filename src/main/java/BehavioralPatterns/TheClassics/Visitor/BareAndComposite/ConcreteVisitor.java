package BehavioralPatterns.TheClassics.Visitor.BareAndComposite;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Officer officer) {
        System.out.print("\t\t" + officer.getFirstName() + " " + officer.getLastName() + " of the " +
                officer.getBranch());

        if (officer.getBattlesFought() > 10) {
            System.out.println(" is battle hardened and may retire.");
        } else {
            System.out.println(" must fight at least " + (11 - officer.getBattlesFought()) + " more times");
        }
    }

    @Override
    public void visit(Grunt grunt) {
        System.out.print("\t\t" + grunt.getFirstName() + " " + grunt.getLastName() + " of the " +
                grunt.getBranch());

        if (grunt.getBattlesFought() > 20) {
            System.out.println(" is battle hardened and may retire.");
        } else {
            System.out.println(" should get in that fox hole, son!");
        }
    }
}
