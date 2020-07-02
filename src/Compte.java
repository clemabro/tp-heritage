
public class Compte {

	private long numero;
	private Client client;
	private float solde;
	
	public Compte(long numero, Client c) {
		super();
		this.numero = numero;
		this.client=c;
	}
	public float getsolde()
	{	
		return solde;
	}
	public Client getClient()
	{	
		return client;
	}
	public long getnumero()
	{	
		return numero;
	}
	public String toString() {
		return "Client " + numero + " - client " + client.getNom() + " - Solde " + solde;
	}
	public void credit(double somme) {
		this.solde += somme;
	}
	
	public static void main(String[] args) {
		Client c1 = new Client(1,"Martin");
		Client c2 = new Client(2,"Dupond");
		Compte com1 = new Compte(10,c1);
		Compte com2 = new Compte(20,c2);
		System.out.println(com1);
		System.out.println(com2);
	}
	
	
	
}
