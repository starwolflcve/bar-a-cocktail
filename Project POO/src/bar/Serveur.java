package bar;

import bar.Commande;

public class Serveur extends Employe {

    public Serveur(String nom, int vitesse) {
        super(nom, vitesse);
    }

    public void servirCommande(Commande commande) {
        System.out.println(nom + " sert la commande n°" + commande.getId());
    }
}
