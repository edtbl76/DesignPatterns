package StructuralPatterns.TheClassics.Composite;

import java.util.*;

public class Launcher {

    public static void main(String[] args) {
        // Create a Data Services Team
        EmployeeLeaf ds1 = new EmployeeLeaf("Dennis", "Smith", "DataServices");
        EmployeeLeaf ds2 = new EmployeeLeaf("Diane", "Samuelson", "DataServices");

        // Create an Ops team
        EmployeeLeaf ops1 = new EmployeeLeaf("Oliver", "Perry", "Operations");
        EmployeeLeaf ops2 = new EmployeeLeaf("Oscar", "Stein", "Operations");
        EmployeeLeaf ops3 = new EmployeeLeaf("Ophelia", "Opperman", "Operations");

        // Create our managers.
        CompositeEmployee dsX = new CompositeEmployee("Diana", "Prince", "DataServices");
        CompositeEmployee opsX = new CompositeEmployee("Theodore", "Cable", "Operations");

        // Create our "root" the CEO.
        CompositeEmployee boss =
                new CompositeEmployee("George", "Wilmington", "The Corner Office");

        // bind our direct reports
        dsX.add(Arrays.asList(ds1, ds2));
        opsX.add(Arrays.asList(ops1, ops2, ops3));

        // bind our managers to CEO
        boss.add(Arrays.asList(dsX, opsX));

        List<Employee> list = Arrays.asList(boss, dsX, opsX, ds1, ds2, ops1, ops2, ops3);

        list.forEach(employee -> {
            System.out.println(" --- " + employee.getName() + " --- ");
            employee.displayInfo();
            System.out.println("DirectReports: " + employee.getHeadCount() + "\n");
        });


    }
}
