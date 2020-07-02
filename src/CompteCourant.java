public class CompteCourant extends Compte{

    public CompteCourant(long numero, Client c) {
        super(numero, c);
    }

    @Override
    public String toString() {
        return "Client " + this.getClient().getNumero() + " - client " + this.getClient().getNom() +
                " - Compte courant n°"+this.getnumero()+" - Solde " + this.getsolde();
    }
}
