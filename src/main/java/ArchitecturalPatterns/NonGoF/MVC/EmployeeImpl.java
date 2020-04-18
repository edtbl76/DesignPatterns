package ArchitecturalPatterns.NonGoF.MVC;

import java.util.Objects;

// Concrete Data Object
public class EmployeeImpl implements Employee {

    private String name;
    private String id;

    public EmployeeImpl(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EmployeeImpl{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeImpl employee = (EmployeeImpl) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
