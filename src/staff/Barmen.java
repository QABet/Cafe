package staff;

import java.util.ArrayList;
import java.util.List;

public class Barmen  extends Employee {


    public Barmen(String firstName, String lastName, int age, Gender gender, int employeeID) {
        super(firstName, lastName, age, gender, employeeID);
    }

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee){
        employeeList.add(employeeID, employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeList.remove(employeeID);
    }

    public void prepareDrink(){

    }




}
