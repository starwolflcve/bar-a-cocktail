public class Chien extends Animal {

    public Chien(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void dormir() {
        System.out.println(getNom() + " (le chien) dort profondément.");
    }

    @Override
    public String toString() {
        return "Chien{nom='" + getNom() + "', age=" + getAge() + "}";
    }
}
