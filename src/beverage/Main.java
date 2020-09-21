package beverage;

import beverage.alcohol.Beer;
import beverage.alcohol.Rum;
import beverage.alcohol.Vodka;
import beverage.alcoholCocktails.Mojito;
import beverage.alcoholCocktails.TequilaSunrise;
import beverage.nonAlcoholDrinks.CocaCola;
import beverage.nonAlcoholDrinks.Juices;
import beverage.nonAlcoholDrinks.RedBull;
import beverage.nonAlcoholDrinks.Water;

public class Main {

    public static void main(String[] args) {
        System.out.println("Beverages");
        System.out.println("Alcohol Cocktails Menu:" + "\n" + new Mojito().toString() + "\n" + new TequilaSunrise().toString());
        System.out.println("Alcohol Drinks Menu:" + "\n" + new Rum().toString() + "\n"
                + new Beer().toString() + "\n" + new Vodka().toString());
        System.out.println("Soft Drinks Menu:" + "\n" + new CocaCola().toString() + "\n" + new RedBull().toString()
                + "\n" + new Water().toString() + "\n" + new Juices().toString());

    }
}
