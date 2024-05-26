package model;

public class CarnetClientele {
	private Client[] clients = new Client[100];
	private int nbClient = 0;

	public void creerClient(String nom, String prenom, String adresseMail, String mdp) {
		clients[nbClient] = new Client(nom, prenom, adresseMail, mdp);
		nbClient++;
	}

	public int trouverClient(String adresseMail) {
		int numClient = -1;
		boolean clientTrouve = false;
		for (int i = 0; i < nbClient && !clientTrouve; i++) {
			if (clients[i].getAdresseMail().equals(adresseMail)) {
				clientTrouve = true;
				numClient = i;
			}
		}
		return numClient;
	}

	public Client getClient(int numClient) {
		return clients[numClient];
	}

	public boolean connecterClient(int numClient, String mdp) {
		return clients[numClient].connecterClient(mdp);
	}

	// UNIQUEMENT POUR VERIFICATION
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		for (int i = 0; i < nbClient; i++) {
			chaine.append(clients[i]);
		}
		return chaine.toString();
	}
}
