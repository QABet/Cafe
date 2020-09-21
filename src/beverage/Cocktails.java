package beverage;

import java.util.List;

public abstract class Cocktails extends AlcoholDrinks {

    protected List<String> ingredients;

    public Cocktails(String name, double volume, float price, float alcoholPercent, List<String> ingredients) {
        super(name, volume, price, alcoholPercent);
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Cocktails{" +
                "ingredients=" + ingredients +
                ", alcoholPercent=" + alcoholPercent +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
