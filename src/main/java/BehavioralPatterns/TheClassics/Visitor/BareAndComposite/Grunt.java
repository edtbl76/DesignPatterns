package BehavioralPatterns.TheClassics.Visitor.BareAndComposite;

public class Grunt implements Soldier {

    private String firstName;
    private String lastName;
    private String branch;
    private final int battlesFought;

    public Grunt(String firstName, String lastName, String branch, int battlesFought) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.branch = branch;
        this.battlesFought = battlesFought;
    }

    @Override
    public void printChainOfCommand() {
        System.out.println("\t" + firstName + " " + lastName + " serves in the " + branch + " and has fought in "
                + battlesFought + " battles");
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

}
