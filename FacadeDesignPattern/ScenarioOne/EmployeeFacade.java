package FacadeDesignPattern.ScenarioOne;

public class EmployeeFacade {
    private EmployeeDao employeeDao;

    public EmployeeFacade() {
        this.employeeDao = new EmployeeDao();
    }

    // now let say instead of client knowing about 100's of
    //  methods in EmployeeDao.. he/she can just use this facade class

    public void insert() {
        employeeDao.insert();
    }

    public void getEmployee(int id) {
        employeeDao.getEmployeeById(id);
    }
}
