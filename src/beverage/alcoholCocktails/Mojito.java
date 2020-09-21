package beverage.alcoholCocktails;

import beverage.Cocktails;

import java.util.List;

public class Mojito extends Cocktails {

    public Mojito() {
        super("Mojito", 1, 2500, 13,
                List.of("Bacardi white rum", "Brown Sugar", "Mint", "Soda"));
    }
}
