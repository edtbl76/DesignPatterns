package ArchitecturalPatterns.NonGoF.MVC;

import java.util.List;

public class ConsoleView implements View {
    @Override
    public void displayRegisteredEmployees(List<Employee> employees) {
       System.out.println("\n *** Console View of Registered Employees *** ");
       employees.forEach(System.out::println);
       System.out.println("--------------------------");
    }
}
