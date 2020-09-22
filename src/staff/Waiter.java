package staff;

import ordering.Order;

public class Waiter extends Employee{
    private Order order;

    public Waiter(String firstName, String lastName, int age, Gender gender, int employeeID, double salary, Order order) {
        super(firstName, lastName, age, gender, employeeID, salary);
        this.order = order;
    }

    public void execute(){
        this.order.execute();
    }
}
