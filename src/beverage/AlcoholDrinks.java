package beverage;

public class AlcoholDrinks extends Drink {

    protected float alcoholPercent;

    public AlcoholDrinks(String name, double volume, float price, float alcoholPercent) {
        super(name, volume, price);
        this.alcoholPercent = alcoholPercent;
    }

    @Override
    public String toString() {
        return "AlcoholDrinks{" +
                "alcoholPercent=" + alcoholPercent +
                ", name='" + name + '\'' +
                ", volume=" + volume +
                ", price=" + price +
                '}';
    }
}
