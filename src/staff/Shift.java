package staff;

import java.util.ArrayList;
import java.util.List;

public abstract class Shift {

    List<Employee> employeeList = new ArrayList<>();


    abstract void checkIn();
    abstract void checkout();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }


}
