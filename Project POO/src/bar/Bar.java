package bar;

import bar.Commande;
import java.util.ArrayList;
import java.util.List;

public class Bar {

    private List<Cocktail> stock = new ArrayList<>();
    private List<Commande> commandes = new ArrayList<>();

    public void ajouterCocktailAuStock(Cocktail cocktail) {
        stock.add(cocktail);
    }

    public Commande creerCommande(Client client) {
        Commande commande = new Commande(client);
        commandes.add(commande);
        return commande;
    }

    public double facturer(Commande commande) {
        return commande.calculerMontant();
    }
    public List<Cocktail> getStock() {
        return stock;
    }

}
