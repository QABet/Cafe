package staff;

import beverage.alcoholCocktails.Mojito;

public class Barmen extends Employee {

    public Barmen(String firstName, String lastName, int age, Gender gender, int employeeID, double salary) {
        super(firstName, lastName, age, gender, employeeID, salary);
    }

    public static void main(String[] args) {
        Barmen barmen = new Barmen("Poghos", "Poghosyan", 22, Gender.MALE, 5, 200000);
        barmen.makeCocktails();
    }

    public void makeCocktails(){
        System.out.println("Barmen makes " + new Mojito());
    }
}
