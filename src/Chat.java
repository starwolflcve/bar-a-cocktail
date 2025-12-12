public class Chat extends Animal {

    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void dormir() {
        System.out.println(getNom() + " (le chat) fait une sieste.");
    }

    @Override
    public String toString() {
        return "Chat{nom='" + getNom() + "', age=" + getAge() + "}";
    }
}
