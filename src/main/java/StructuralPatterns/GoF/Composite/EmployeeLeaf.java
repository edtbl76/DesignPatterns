package StructuralPatterns.GoF.Composite;

public class EmployeeLeaf implements Employee {

    private int headcount = 0;
    private String firstName;
    private String lastName;
    private String team;

    public EmployeeLeaf(String firstName, String lastName, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
    }

    @Override
    public void displayInfo() {
        System.out.println(String.format("\t%s %s works in %s", this.firstName, this.lastName, this.team));
    }

    @Override
    public int getHeadCount() {
        return headcount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getTeam() {
        return team;
    }

}
