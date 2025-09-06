package ProxyDesignPattern;

public class Employee implements EmployeeDaoInterface {

    @Override
    public void createEmployee(String client, String empName) {
        System.out.println("Employee created: " + empName);
    }

    @Override
    public void updateEmployee(String client, String empName) throws Exception {
        System.out.println("Employee updated: " + empName);
    }

    @Override
    public void deleteEmployee(String client, int employeeId) throws Exception {
        System.out.println("Employee deleted with id: " + employeeId);
    }
}
