package meal;

import java.util.ArrayList;
import java.util.List;

public abstract class HotMeal extends Meal {

    private List<Ingredients> ingredients;

    public HotMeal(String name, float price, List<Ingredients> ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    public void addIngredients(Ingredients ingredient){
        ingredients.add(ingredient);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Ingredients ingredients : ingredients) {
            cost += ingredients.price();
        }
        return cost;
    }

    public void showItems() {

        for (Ingredients ingredients : ingredients) {
            System.out.print("Ingredient name : " + ingredients.name());
            System.out.println("Ingredient volume: " + ingredients.volume());
            System.out.println("Ingredient price: " + ingredients.price());
        }
    }
}
