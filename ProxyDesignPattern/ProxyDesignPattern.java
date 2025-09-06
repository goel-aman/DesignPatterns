package ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        EmployeeDaoInterface employeeProx = new EmployeeProxy();

        try {
            employeeProx.createEmployee("User", "Aman");
            employeeProx.updateEmployee("User", "Aman");
            employeeProx.deleteEmployee("ADMIN", 1);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}
