package bar;

import java.util.List;

public class CocktailSansAlcool extends Cocktail {

    public CocktailSansAlcool(String nom, double prix, List<String> ingredients, String recette, String verre) {
        super(nom, prix, ingredients, recette, verre);
    }

    @Override
    public boolean contientAlcool() {
        return false;
    }
}
