// Classe parent abstraite
public abstract class Animal {
    private String nom;
    private int age;

    // Constructeur
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getters / Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Méthode dormir()
    public void dormir() {
        System.out.println(nom + " dort.");
    }

    // Méthode ToString()
    @Override
    public String toString() {
        return "Animal{nom='" + nom + "', age=" + age + "}";
    }
}
