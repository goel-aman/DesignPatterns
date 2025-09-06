package ProxyDesignPattern;

public class EmployeeProxy implements EmployeeDaoInterface {
    Employee employee;

    public EmployeeProxy() {
        this.employee = new Employee();
    }

    @Override
    public void createEmployee(String client, String empName) throws Exception {
        // TODO Auto-generated method stub
        if(client.equals("ADMIN")) {
            employee.createEmployee(client, empName);
        } else {
            throw new Exception("No access");
        }
    }

    @Override
    public void updateEmployee(String client, String empName) throws Exception {
        if(client.equals("User") || client.equals("Employee")) {
            employee.updateEmployee(client, empName);
        } else {
            throw new Exception("No access");
        }
    }

    @Override
    public void deleteEmployee(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")) {
            employee.deleteEmployee(client, employeeId);
        } else {
            throw new Exception("no access");
        }
    }
}