package ArchitecturalPatterns.NonGoF.MVC;

import java.util.List;

public class EmployeeController implements Controller {

    /*
        Object composition > inheritance
     */
    private Model model;
    private View view;

    public EmployeeController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void displayRegisteredEmployees() {
        // Get Data From Model
        List<Employee> employees = model.getEmployeeDetailsFromModel();

        // Connect it to view
        view.displayRegisteredEmployees(employees);
    }

    @Override
    public void registerEmployee(Employee employee) {
        model.registerEmployee(employee);
    }

    @Override
    public void unregisterEmployee(String employeeId) {
        model.unregisterEmployee(employeeId);
    }
}
