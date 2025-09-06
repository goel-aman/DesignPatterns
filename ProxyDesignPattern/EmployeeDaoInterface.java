package ProxyDesignPattern;


public interface EmployeeDaoInterface {
    void createEmployee(String client, String empName) throws Exception;
    void updateEmployee(String client, String empName) throws Exception;
    void deleteEmployee(String client, int employeeId) throws Exception;
}

