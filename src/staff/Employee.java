package staff;

public abstract class Employee extends Person{
    protected int employeeID;
    protected double salary;

    public Employee(String firstName, String lastName, int age, Gender gender, int employeeID, double salary) {
        super(firstName, lastName, age, gender);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
