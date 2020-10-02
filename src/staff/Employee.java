package staff;


public abstract class Employee extends Person{
    protected int employeeID;

    public Employee(String firstName, String lastName, int age, Gender gender, int employeeID) {
        super(firstName, lastName, age, gender);
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void addEmployee(Employee employee){

    }

    public void removeEmployee(Employee employee){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
