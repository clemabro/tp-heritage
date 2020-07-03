import java.util.ArrayList;
import java.util.Iterator;

public class BanqueApp {

	
	private ArrayList<Client> client = new ArrayList<Client>(); //tableau de client
	
	
	public void addClient(Client c) {
		getClient().add(c);
	}
	
	public ArrayList<Client> getClient() {//ArrayList de Client
		return client;
	}
	
	
	public static void main(String [] args){
	
		BanqueApp BanqueApp1 = new BanqueApp();
		System.out.println("Banque DuTresor");
		
		Client c1 = new Client(1,"Client1");//créer une ArrayList de Client
		Client c2 = new Client(2,"Client2");
		Client c3 = new Client(3,"Client3");
		Client c4 = new Client(4,"Client4");
		
		BanqueApp1.addClient(c1);//ajouter 4 clients à la collection des clients de la banque (numéro 1 à 4 et nom								
		BanqueApp1.addClient(c2);//"Client" suivi du numéro : Client1, Client2, etc.)
		BanqueApp1.addClient(c3);
		BanqueApp1.addClient(c4);
		
		
			Iterator<Client> iterator_client = BanqueApp1.getClient().iterator();//lister les clients de la banque
			while(iterator_client.hasNext()) {
				Client client_banqueapp = iterator_client.next();
				
			
				System.out.println(client_banqueapp);
				
			}
		
		
		
		
		
		
		iterator_client = BanqueApp1.getClient().iterator();
		while(iterator_client.hasNext()) {//dans une boucle, parcourir les clients pour leur ajouter des comptes :
			
			Client client_banqueapp = iterator_client.next();//récupérer le client
			
			CompteCourant com1 = new CompteCourant((client_banqueapp.getNumero()*(1000 + 1)),client_banqueapp);//créer un compte courant pour le client (numéro de compte : numéro du client *1000 + 1)
			CompteEpargne com2 = new CompteEpargne((client_banqueapp.getNumero()*(1000 + 1)),client_banqueapp,com1,(float)50);//créer un compte épargne pour le client (numéro de compte : numéro du client *
																																//1000 + 2, référence au compte courant (pour les transferts) et montant de
																																//transfert de 50
			
			client_banqueapp.addCompte(com2);//ajouter les 2 comptes au client
			client_banqueapp.addCompte(com1);

			
			
		}
	
		
		
		
		 iterator_client = BanqueApp1.getClient().iterator();//lister les clients de la banque
			while(iterator_client.hasNext()) {
				Client client_banqueapp = iterator_client.next();
				
			
				System.out.println(client_banqueapp);
				
			}

			
		
}


}
