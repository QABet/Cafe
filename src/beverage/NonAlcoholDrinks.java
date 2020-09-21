package beverage;

public class NonAlcoholDrinks extends Drink {
    protected int sugarPercent;
    protected String sweeteners;

    public NonAlcoholDrinks(String name, double volume, float price, int sugarPercent, String sweeteners) {
        super(name, volume, price);
        this.sugarPercent = sugarPercent;
        this.sweeteners = sweeteners;
    }
}
