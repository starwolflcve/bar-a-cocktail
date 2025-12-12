public class Main {
    public static void main(String[] args) {
        // Instanciation de 2 objets des classes enfants
        Chien chien = new Chien("Rex", 5);
        Chat chat = new Chat("Mimi", 3);

        // Appel de dormir()
        chien.dormir();
        chat.dormir();

        // Appel de ToString()
        System.out.println(chien.toString());
        System.out.println(chat.toString());
    }
}
