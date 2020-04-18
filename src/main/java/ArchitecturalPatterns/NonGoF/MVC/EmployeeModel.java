package ArchitecturalPatterns.NonGoF.MVC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class EmployeeModel implements Model {

    List<Employee> registry;

    public EmployeeModel() {
        registry = new ArrayList<>();
        registry.add(new EmployeeImpl("Ed", "1"));
        registry.add(new EmployeeImpl("Mike", "2"));
        registry.add(new EmployeeImpl("Connor", "3"));
        registry.add(new EmployeeImpl("Gravy", "4"));
    }

    @Override
    public List<Employee> getEmployeeDetailsFromModel() {
        return registry;
    }

    @Override
    public void registerEmployee(Employee employee) {
        System.out.println("\tAttempting to register employee");
        if (!registry.contains(employee)) {
            registry.add(employee);
            System.out.println(employee + " added");
        } else {
            System.out.println("Employee is already registered");
        }
    }

    @Override
    public void unregisterEmployee(String employeeId) {
        boolean flag = false;
        ListIterator<Employee> iterator = registry.listIterator();
        System.out.println("\tAttempting to remove employee");
        while (iterator.hasNext()) {
            Employee employee = iterator.next();

            if (employee.getId().equals(employeeId)) {
               iterator.remove();
                System.out.println("Employee " + employee.getName() + " [" + employee.getId() + "] removed");
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Employee Id " + employeeId + " not found.");
        }
    }
}
