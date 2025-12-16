package bar;

public abstract class Employe {

    protected String nom;
    protected int vitesse;

    public Employe(String nom, int vitesse) {
        this.nom = nom;
        this.vitesse = vitesse;
    }

    public String getNom() {
        return nom;
    }
}
