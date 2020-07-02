
public class Client {
	private long numero;
	private String nom;
	
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

	@Override
	public String toString() {
		return "Client " + numero + " - " + nom;
	}
	
}
