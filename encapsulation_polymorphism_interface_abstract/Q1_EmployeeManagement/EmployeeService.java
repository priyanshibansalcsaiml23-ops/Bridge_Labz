package q1_employeemanagement;

public class EmployeeService {
    public void processEmployee(Employee emp) {
        emp.displayDetails();
        System.out.println("Calculated Salary: " + emp.calculateSalary());
    }
}
