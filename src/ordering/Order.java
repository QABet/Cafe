package ordering;

import beverage.Drink;
import meal.Meal;
import staff.Barmen;
import staff.Chef;

public class Order implements Command{
    Chef chef;
    Meal meal;
    Drink drink;
    Barmen barmen;


    public Order(Chef chef, Meal meal) {
        this.chef = chef;
        this.meal = meal;
    }

    @Override
    public void execute(){
        if(drink instanceof Drink){
            this.barmen.prepareDrink();
        }else {
            System.out.println();
        }
    }
}
