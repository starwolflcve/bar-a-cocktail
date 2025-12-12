package bar;

import java.util.ArrayList;
import java.util.List;

public class Commande implements Facturable {
    private Client client;
    private Employe serveur;
    private List<Cocktail> cocktails = new ArrayList<>();

    public Commande(Client client, Employe serveur) {
        this.client = client;
        this.serveur = serveur;
    }

    public void ajouterCocktail(Cocktail c) {
        cocktails.add(c);
    }

    public Client getClient() {
        return client;
    }

    public Employe getServeur() {
        return serveur;
    }

    public List<Cocktail> getCocktails() {
        return cocktails;
    }

    @Override
    public double calculerTotal() {
        double total = 0;
        for (Cocktail c : cocktails) {
            total += c.getPrix();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Commande de ").append(client.getNom())
                .append(" (serveur : ").append(serveur.getNom()).append(")\n");
        for (Cocktail c : cocktails) {
            sb.append(" - ").append(c).append("\n");
        }
        sb.append("Total : ").append(calculerTotal()).append("€\n");
        return sb.toString();
    }
}
