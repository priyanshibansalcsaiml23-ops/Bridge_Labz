package q3_employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee.setCompanyName("Tech Solutions Inc.");

        Employee emp1 = new Employee("Thamarai", 101, "Software Engineer");
        Employee emp2 = new Employee("Rohan", 102, "Project Manager");

        Employee.displayTotalEmployees();

        EmployeeService service = new EmployeeService();
        service.showEmployee(emp1);
        service.showEmployee(emp2);
    }
}
