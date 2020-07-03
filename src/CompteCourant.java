public class CompteCourant extends Compte{//compte courant, qui sert aux opérations quotidiennes.
//1. la classe ’CompteCourant’ hérite de Compte
	
	
	
	//2. elle définit un constructeur qui attend un numéro de compte et un client : ce constructeur
	//appellera le constructeur de la classe Compte en lui passant les valeurs de numéro et Client
	//(méthode ’super’)
    public CompteCourant(long numero, Client c) {
        super(numero, c);
    }

    
    
    //3. elle redéfinit la méthode toString() pour afficher "Compte courant no " numéro du compte et
    //solde (cf. exemple plus bas)
    @Override
    public String toString() {
        return "Client " + this.getClient().getNumero() + " - client " + this.getClient().getNom() +
                " - Compte courant nÂ°"+this.getnumero()+" - Solde " + this.getsolde();
    }
}
