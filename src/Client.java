import java.util.ArrayList;
import java.util.Iterator;

public class Client {
	private long numero;
	private String nom;
	private ArrayList<Compte> comptes = new ArrayList<Compte>();
	
	/**
	 * @param numero
	 * @param nom
	 */
	public Client(long numero, String nom) {
		super();
		this.numero = numero;
		this.nom = nom;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void addCompte(Compte c) {
		getComptes().add(c);
	}

	public ArrayList<Compte> getComptes() {
		return comptes;
	}

	@Override
	public String toString() {
		String text = "Client " + numero + " - " + nom;
		
		if(getComptes() != null && !getComptes().isEmpty()) {
			Iterator<Compte> iterator_compte = getComptes().iterator();
			while(iterator_compte.hasNext()) {
				Compte compte_client = iterator_compte.next();
				text += "\nCompte n°" + compte_client.getnumero() + " - Solde " + compte_client.getsolde();
			}
		} else {
			text += " pas de compte rattaché à ce client";
		}
		
		return text;
	}
	
	public static void main(String [] args){
		Client c1 = new Client(1,"Martin");
		Client c2 = new Client(2,"Dupond");
		System.out.println(c1);
		System.out.println(c2);
		c2.setNom("Pichon");
		Compte com1 = new Compte(10,c1);
		Compte com2 = new Compte(20,c1);
		c1.addCompte(com1);
		c1.addCompte(com2);
		System.out.println(c1);
		com1.credit(500.0);
		System.out.println(c1);
	}
	
}
