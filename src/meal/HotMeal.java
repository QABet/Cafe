package meal;

public abstract class HotMeal extends Meal {

    protected String mealIngredients;

    public HotMeal(String name, float price, String mealIngredients) {
        super(name, price);
        this.mealIngredients = mealIngredients;
    }

    public void mixIngredients(){

    }
}
