package ArchitecturalPatterns.NonGoF.MVC;

public interface Controller {

    void displayRegisteredEmployees();
    void registerEmployee(Employee employee);
    void unregisterEmployee(String employeeId);
}
