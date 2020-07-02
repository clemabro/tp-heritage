public class CompteEpargne extends Compte{

    private CompteCourant compteTransfert;
    private float montantTransfert;

    public CompteEpargne(long numero, Client c, CompteCourant cpt, float mt) {
        super(numero, c);
        this.compteTransfert = cpt;
        this.montantTransfert = mt;
    }

    public void transfer(){
        this.credit(montantTransfert);
        compteTransfert.debit(montantTransfert);
    }

    @Override
    public String toString() {
        return "Client " + this.getClient().getNumero() + " - client " + this.getClient().getNom() +
                " - Compte epargne n°"+this.getnumero()+" - Solde " + this.getsolde();
    }

}
