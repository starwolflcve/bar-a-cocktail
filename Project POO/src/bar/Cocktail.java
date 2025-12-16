package bar;

import java.util.List;

public abstract class Cocktail {

    protected String nom;
    protected double prix;
    protected List<String> ingredients;
    protected String recette;
    protected String verre;

    public Cocktail(String nom, double prix, List<String> ingredients, String recette, String verre) {
        this.nom = nom;
        this.prix = prix;
        this.ingredients = ingredients;
        this.recette = recette;
        this.verre = verre;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getRecette() {
        return recette;
    }

    public String getVerre() {
        return verre;
    }

    public abstract boolean contientAlcool();

    public double calculerPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return nom + " (" + (contientAlcool() ? "Avec alcool" : "Sans alcool") + ") - " + prix + "€";
    }
}
