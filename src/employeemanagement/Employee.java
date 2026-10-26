
package employeemanagement;

public class Employee {

    int employeeId;
    String name;
    String department;
    double monthlySalary;
    boolean isActive;

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Active: " + isActive);
    }
}
