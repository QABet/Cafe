package meal;

public abstract class Meal {
    protected String name;
    protected float price;

    public Meal(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

}
