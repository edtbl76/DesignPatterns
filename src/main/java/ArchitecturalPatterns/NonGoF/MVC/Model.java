package ArchitecturalPatterns.NonGoF.MVC;

import java.util.List;

public interface Model {

    List<Employee> getEmployeeDetailsFromModel();
    void registerEmployee(Employee employee);
    void unregisterEmployee(String employeeId);
}
