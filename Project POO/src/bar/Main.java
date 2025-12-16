package bar;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bar bar = new Bar();

        // Barmen disponibles
        List<Barman> barmen = List.of(
                new Barman("Marco", 5),
                new Barman("Luis", 4),
                new Barman("Sofia", 6)
        );

        // Création des cocktails
        bar.ajouterCocktailAuStock(new CocktailAvecAlcool(
                "Mojito",
                7.0,
                List.of("Rhum", "Menthe", "Citron vert", "Sucre", "Eau gazeuse"),
                "Écraser la menthe avec le sucre et le citron, ajouter le rhum puis l'eau gazeuse.",
                "Verre highball"
        ));

        bar.ajouterCocktailAuStock(new CocktailSansAlcool(
                "Virgin Mojito",
                5.0,
                List.of("Menthe", "Citron vert", "Sucre", "Eau gazeuse"),
                "Écraser la menthe avec le sucre et le citron, compléter avec l'eau gazeuse.",
                "Verre highball"
        ));

        bar.ajouterCocktailAuStock(new CocktailAvecAlcool(
                "Piña Colada",
                8.0,
                List.of("Rhum", "Crème de coco", "Jus d'ananas"),
                "Mixer tous les ingrédients avec de la glace pilée.",
                "Verre hurricane"
        ));

        System.out.println("🍸 Bienvenue au bar 🍸");

        boolean barOuvert = true;
        int indexBarman = 0;

        while (barOuvert) {

            // Création du client
            System.out.print("\nNom du client : ");
            Client client = new Client(scanner.nextLine());

            // Attribution d’un barman
            Barman barman = barmen.get(indexBarman % barmen.size());
            indexBarman++;

            System.out.println("👉 " + barman.getNom() + " va s'occuper de vous.");

            Commande commande = bar.creerCommande(client);
            boolean commander = true;

            while (commander) {

                System.out.print("\nSouhaitez-vous un cocktail avec ou sans alcool ? (alcool/sans) : ");
                String choixAlcool = scanner.nextLine().toLowerCase();

                List<Cocktail> choix = new ArrayList<>();
                for (Cocktail c : bar.getStock()) {
                    if (choixAlcool.equals("alcool") && c.contientAlcool()) {
                        choix.add(c);
                    }
                    if (choixAlcool.equals("sans") && !c.contientAlcool()) {
                        choix.add(c);
                    }
                }

                if (choix.isEmpty()) {
                    System.out.println("Aucun cocktail disponible.");
                    continue;
                }

                System.out.println("\nCocktails disponibles :");
                for (int i = 0; i < choix.size(); i++) {
                    System.out.println((i + 1) + ". " + choix.get(i));
                }

                System.out.print("Votre choix : ");
                int selection = Integer.parseInt(scanner.nextLine());

                Cocktail cocktailChoisi = choix.get(selection - 1);
                barman.preparerCocktail(cocktailChoisi);
                commande.ajouterCocktail(cocktailChoisi);

                System.out.print("\n" + barman.getNom() + " : En voulez-vous un autre ? (oui/non) : ");
                if (!scanner.nextLine().equalsIgnoreCase("oui")) {
                    commander = false;
                }
            }

            System.out.println("\n💰 Total à payer pour " + client.getNom() + " : "
                    + bar.facturer(commande) + "€");

            System.out.print("\nUn autre client ? (oui/non) : ");
            if (!scanner.nextLine().equalsIgnoreCase("oui")) {
                barOuvert = false;
            }
        }

        System.out.println("\n🍹 Le bar ferme, à bientôt !");
        scanner.close();
    }
}
