package BehavioralPatterns.TheClassics.Visitor.BareAndComposite;

import java.util.ArrayList;
import java.util.List;

public class Officer implements Soldier {

    private String firstName;
    private String lastName;
    private String branch;
    private final int battlesFought;

    private List<Soldier> soldiers;

    public Officer(String firstName, String lastName, String branch, int battlesFought) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.branch = branch;
        this.battlesFought = battlesFought;
        soldiers = new ArrayList<>();
    }

    public void add(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void remove(Soldier soldier) {
        soldiers.remove(soldier);
    }



    @Override
    public void printChainOfCommand() {
        System.out.println("\t" + firstName + " " + lastName + " serves in the " + branch + " and has fought in "
                + battlesFought + " battles");
        soldiers.forEach(Soldier::printChainOfCommand);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getBattlesFought() {
        return battlesFought;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(List<Soldier> soldiers) {
        this.soldiers = soldiers;
    }

}
