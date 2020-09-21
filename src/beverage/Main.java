package beverage;

import beverage.alcohol.Beer;
import beverage.alcohol.Rum;
import beverage.alcohol.Vodka;
import beverage.alcoholCocktails.Mojito;
import beverage.alcoholCocktails.TequilaSunrise;

public class Main {

    public static void main(String[] args) {
        System.out.println("Alcohol Cocktails Menu:" + "\n" + new Mojito().toString() + "\n" + new TequilaSunrise().toString());
        System.out.println("Alcohol Drinks Menu:" + "\n" + new Rum().toString() + "\n"
                + new Beer().toString() + "\n" + new Vodka().toString());
    }
}
