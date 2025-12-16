package bar;

import java.util.List;

public class CocktailAvecAlcool extends Cocktail {

    private static final double TAXE_ALCOOL = 1.5;

    public CocktailAvecAlcool(String nom, double prix, List<String> ingredients, String recette, String verre) {
        super(nom, prix, ingredients, recette, verre);
    }

    @Override
    public boolean contientAlcool() {
        return true;
    }

    @Override
    public double calculerPrix() {
        return prix + TAXE_ALCOOL;
    }
}
