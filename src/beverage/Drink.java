package beverage;

public abstract class Drink {
    protected String name;
    protected double volume;
    protected float price;

    public Drink(String name, double volume, float price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public float getPrice() {
        return price;
    }
}
