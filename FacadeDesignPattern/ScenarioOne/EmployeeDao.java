package FacadeDesignPattern.ScenarioOne;

public class EmployeeDao {
    // let say employeeDao has many methods 

    public void insert() {
        // insert into employee table
    }

    public void updateEmployeeName() {
        // updating employee name..
    }

    public Employee getEmployeeDetails(String emailId) {
         // getting employee details from db..
         return new Employee();
    }

    public Employee getEmployeeById(int empId) {
        return new Employee();
    } 
}
