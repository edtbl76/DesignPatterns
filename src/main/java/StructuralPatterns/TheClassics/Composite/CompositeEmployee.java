package StructuralPatterns.TheClassics.Composite;

import java.util.*;

public class CompositeEmployee implements Employee {

    private int headcount = 0;
    private String firstName;
    private String lastName;
    private String team;

    private List<Employee> children;

    public CompositeEmployee(String firstName, String lastName, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        children = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println(String.format("\t%s %s works in %s", this.firstName, this.lastName, this.team));
        children.forEach(Employee::displayInfo);
    }

    @Override
    public int getHeadCount() {
        headcount = children.size();
        children.forEach(Employee::getHeadCount);
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

    public void add(Employee employee) {
        children.add(employee);
    }

    public void add(Iterable<Employee> iterable) {
        iterable.forEach(this::add);
    }

    public void remove(Employee employee) {
        children.remove(employee);
    }
}
