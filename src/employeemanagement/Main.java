
package employeemanagement;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.employeeId = 101;
        e1.name = "Neha";
        e1.department = "IT";
        e1.monthlySalary = 30000;
        e1.isActive = true;

        e1.displayDetails();

        System.out.println("--------------------");

        Employee e2 = new Employee();

        e2.employeeId = 102;
        e2.name = "Rahul";
        e2.department = "HR";
        e2.monthlySalary = 20000;
        e2.isActive = false;

        e2.displayDetails();
    }
}
