import java.util.ArrayList;
import java.util.Iterator;

public class BanqueApp {

	
	private ArrayList<Client> client = new ArrayList<Client>();
	
	
	public void addClient(Client c) {
		getClient().add(c);
	}
	
	public ArrayList<Client> getClient() {
		return client;
	}
	
	
	public static void main(String [] args){
	
		BanqueApp BanqueApp1 = new BanqueApp();
		System.out.println(BanqueApp1);
		
		Client c1 = new Client(1,"Client1");
		Client c2 = new Client(2,"Client2");
		Client c3 = new Client(3,"Client3");
		Client c4 = new Client(4,"Client4");
		
		BanqueApp1.addClient(c1);
		BanqueApp1.addClient(c2);
		BanqueApp1.addClient(c3);
		BanqueApp1.addClient(c4);
		
		
		
		if(BanqueApp1.getClient() != null && !BanqueApp1.getClient().isEmpty()) {
		
			Iterator<Client> iterator_client = BanqueApp1.getClient().iterator();
			while(iterator_client.hasNext()) {
				Client client_banqueapp = iterator_client.next();
				
			
				System.out.println(client_banqueapp);
				
			}
		}
		else {
			System.out.println(" pas de client rattaché cette banque");
		}
		
		
		
		
		
		
		
		Iterator<Client> iterator_client = BanqueApp1.getClient().iterator();
		while(iterator_client.hasNext()) {
			
			Client client_banqueapp = iterator_client.next();
			
			CompteCourant com1 = new CompteCourant((client_banqueapp.getNumero()*(1000 + 1)),client_banqueapp);
			CompteEpargne com2 = new CompteEpargne((client_banqueapp.getNumero()*(1000 + 1)),client_banqueapp,com1,(float)50);
			
			client_banqueapp.addCompte(com2);
			client_banqueapp.addCompte(com1);

			
			
		}
	
		
		
		
		 iterator_client = BanqueApp1.getClient().iterator();
			while(iterator_client.hasNext()) {
				Client client_banqueapp = iterator_client.next();
				
			
				System.out.println(client_banqueapp);
				
			}

			
		
}


}
