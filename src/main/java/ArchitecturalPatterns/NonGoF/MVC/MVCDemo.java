package ArchitecturalPatterns.NonGoF.MVC;

public class MVCDemo {

    public static void main(String[] args) {

        Model model = new EmployeeModel();
        View view = new ConsoleView();
        Controller controller = new EmployeeController(model, view);

        controller.displayRegisteredEmployees();

        // Add
        controller.registerEmployee(new EmployeeImpl("Vanessa", "5"));
        controller.displayRegisteredEmployees();

        // Remove
        controller.unregisterEmployee("5");
        controller.displayRegisteredEmployees();

        // Remove Fail
        controller.unregisterEmployee("5");
        controller.displayRegisteredEmployees();

        // Avoid Dupe
        controller.registerEmployee(new EmployeeImpl("Gravy", "4"));


    }
}
