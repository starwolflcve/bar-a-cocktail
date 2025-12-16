package bar;

import java.util.ArrayList;
import java.util.List;

public class Commande implements Facturable {

    private static int compteur = 1;

    private int id;
    private Client client;
    private List<Cocktail> cocktails = new ArrayList<>();

    public Commande(Client client) {
        this.id = compteur++;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void ajouterCocktail(Cocktail cocktail) {
        cocktails.add(cocktail);
    }

    @Override
    public double calculerMontant() {
        return cocktails.stream()
                .mapToDouble(Cocktail::calculerPrix)
                .sum();
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }
}
