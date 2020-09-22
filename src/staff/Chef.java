package staff;

public class Chef extends Employee{

    public Chef(String firstName, String lastName, int age, Gender gender, int employeeID, double salary) {
        super(firstName, lastName, age, gender, employeeID, salary);
    }

    public void cookPizza(){
        System.out.println("Chef cooking Pizza Margarita");
    }

    public void serveOnThePlate(){
        System.out.println("Serving process...");
    }
}
