package ordering;

import meal.Meal;
import staff.Chef;

public class Order implements Command{
    Chef chef;
    Meal meal;

    public Order(Chef chef, Meal meal) {
        this.chef = chef;
        this.meal = meal;
    }

    @Override
    public void execute(){
        if(this.meal.equals("Pizza")){
            this.chef.cookPizza();
        }else {
            this.chef.serveOnThePlate();
        }
    }
}
