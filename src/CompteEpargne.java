public class CompteEpargne extends Compte{//compte �pargne, vers lequel on effectue p�riodiquement des op�rations de transfert d�un
	//1. la classe �CompteEpargne� h�rite de Compte					//montant fixe � partir d�un compte courant
 
	//2. elle d�finit les attributs permettant la m�morisation du compte courant de transfert et du
	//montant de transfert
	private CompteCourant compteTransfert;
    private float montantTransfert;
    
    //3. elle d�finit un constructeur qui attend un num�ro de compte, un montant de transfert, un
    //client et un compte courant � partir duquel des transferts seront r�alis�s : ce constructeur
    //appellera le constructeur de la classe Compte en lui passant les valeurs de num�ro et Client
    //(m�thode �super�)
    public CompteEpargne(long numero, Client c, CompteCourant cpt, float mt) {
        super(numero, c);
        this.compteTransfert = cpt;
        this.montantTransfert = mt;
    }
    
    //4. elle d�finit une m�thode �transfert()� qui cr�dite le compte et d�bite le compte courant en
    //utilisant le montant de transfert
    public void transfer(){
        this.credit(montantTransfert);
        compteTransfert.debit(montantTransfert);
    }

    //5. elle red�finit la m�thode toString() pour afficher "Compte �pargne no " num�ro du compte et
    //solde (cf. exemple plus bas)
    
    @Override
    public String toString() {
        return "Client " + this.getClient().getNumero() + " - client " + this.getClient().getNom() +
                " - Compte epargne n°"+this.getnumero()+" - Solde " + this.getsolde();
    }

}
