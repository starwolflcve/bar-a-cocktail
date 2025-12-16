package bar;

public class Barman extends Employe {

    public Barman(String nom, int vitesse) {
        super(nom, vitesse);
    }

    public void preparerCocktail(Cocktail cocktail) {
        System.out.println(nom + " prépare le cocktail : " + cocktail.getNom());
        System.out.println("Recette : " + cocktail.getRecette());
        System.out.println("Verre : " + cocktail.getVerre());
    }
}
