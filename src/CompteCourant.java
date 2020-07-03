public class CompteCourant extends Compte{//compte courant, qui sert aux op�rations quotidiennes.
//1. la classe �CompteCourant� h�rite de Compte
	
	
	
	//2. elle d�finit un constructeur qui attend un num�ro de compte et un client : ce constructeur
	//appellera le constructeur de la classe Compte en lui passant les valeurs de num�ro et Client
	//(m�thode �super�)
    public CompteCourant(long numero, Client c) {
        super(numero, c);
    }

    
    
    //3. elle red�finit la m�thode toString() pour afficher "Compte courant no " num�ro du compte et
    //solde (cf. exemple plus bas)
    @Override
    public String toString() {
        return "Client " + this.getClient().getNumero() + " - client " + this.getClient().getNom() +
                " - Compte courant n°"+this.getnumero()+" - Solde " + this.getsolde();
    }
}
