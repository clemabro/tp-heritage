public class CompteEpargne extends Compte{//compte épargne, vers lequel on effectue périodiquement des opérations de transfert d’un
	//1. la classe ’CompteEpargne’ hérite de Compte					//montant fixe à partir d’un compte courant
 
	//2. elle définit les attributs permettant la mémorisation du compte courant de transfert et du
	//montant de transfert
	private CompteCourant compteTransfert;
    private float montantTransfert;
    
    //3. elle définit un constructeur qui attend un numéro de compte, un montant de transfert, un
    //client et un compte courant à partir duquel des transferts seront réalisés : ce constructeur
    //appellera le constructeur de la classe Compte en lui passant les valeurs de numéro et Client
    //(méthode ’super’)
    public CompteEpargne(long numero, Client c, CompteCourant cpt, float mt) {
        super(numero, c);
        this.compteTransfert = cpt;
        this.montantTransfert = mt;
    }
    
    //4. elle définit une méthode ’transfert()’ qui crédite le compte et débite le compte courant en
    //utilisant le montant de transfert
    public void transfer(){
        this.credit(montantTransfert);
        compteTransfert.debit(montantTransfert);
    }

    //5. elle redéfinit la méthode toString() pour afficher "Compte épargne no " numéro du compte et
    //solde (cf. exemple plus bas)
    
    @Override
    public String toString() {
        return "Client " + this.getClient().getNumero() + " - client " + this.getClient().getNom() +
                " - Compte epargne nÂ°"+this.getnumero()+" - Solde " + this.getsolde();
    }

}
