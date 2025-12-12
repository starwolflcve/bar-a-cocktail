public class Voiture {
    String modele;
    int vitesse;
    int acceleration;

    Voiture(String nModele; int nVitesse; int nAcceleration) {
        modele = nModele;
        vitesse = nVitesse;
        acceleration = nAcceleration;

    }

    void Accelerer() {
        vitesse -= acceleration /2;
    }

    void ToString() {
        IO.println("je suis un modele : " + modele);
        IO.println("j'ai une vitesse de : " + vitesse);
        IO.println("j'ai une acceleration de : " + acceleration);
    }
}
