package bar;

public class Cocktail {
    private String nom;
    private double prix;
    private boolean alcoolise;

    public Cocktail(String nom, double prix, boolean alcoolise) {
        this.nom = nom;
        this.prix = prix;
        this.alcoolise = alcoolise;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public boolean isAlcoolise() {
        return alcoolise;
    }

    @Override
    public String toString() {
        return nom + " (" + prix + "€" + (alcoolise ? ", alcoolisé" : ", sans alcool") + ")";
    }
}
