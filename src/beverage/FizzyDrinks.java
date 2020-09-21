package beverage;

public class FizzyDrinks extends NonAlcoholDrinks {
    protected float caffeinPercentage;

    public FizzyDrinks(String name, double volume, float price, int sugarPercent, String sweeteners, float caffeinPercentage) {
        super(name, volume, price, sugarPercent, sweeteners);
        this.caffeinPercentage = caffeinPercentage;
    }

    @Override
    public String toString() {
        return "FizzyDrinks{" +
                "caffeinPercentage=" + caffeinPercentage +
                ", sugarPercent=" + sugarPercent +
                ", sweeteners='" + sweeteners + '\'' +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
