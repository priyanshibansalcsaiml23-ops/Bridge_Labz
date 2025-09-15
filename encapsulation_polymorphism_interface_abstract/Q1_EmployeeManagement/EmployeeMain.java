package q1_employeemanagement;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(1, "Alice", 50000);
        Employee emp2 = new PartTimeEmployee(2, "Bob", 200, 20);

        EmployeeService service = new EmployeeService();
        service.processEmployee(emp1);
        service.processEmployee(emp2);
    }
}
