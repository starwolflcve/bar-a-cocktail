public class CompteBanque {
    private double solde;
    private String proprio;
    private boolean bloque;


    public CompteBanque(String proprio) {
        this.proprio = proprio;
        this.solde = 0;
        this.bloque = false;

    }

    public CompteBanque(String proprio, double solde){
        this.proprio = proprio;
        this.solde = solde;
        this.bloque = false;
    }

    public void ToString(){

    }
}
