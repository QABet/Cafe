package meal;

public abstract class ColdMeal extends  Meal{

    public ColdMeal(String name, float price) {
        super(name, price);
    }

    public void nonHeat(){

    }

    @Override
    public String toString() {
        return "ColdMeal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
