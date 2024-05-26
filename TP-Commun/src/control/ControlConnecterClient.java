package control;

import model.CarnetClientele;

public class ControlConnecterClient {
	CarnetClientele carnetClientel;

	public ControlConnecterClient(CarnetClientele carnetClientel) {
		this.carnetClientel = carnetClientel;
	}

	public int connecterClient(String adresseMail, String mdp) {
		int numClient = carnetClientel.trouverClient(adresseMail);
		if (numClient != -1) {
			boolean mdpOK = carnetClientel.connecterClient(numClient, mdp);
			if (!mdpOK) {
				numClient = -1;
			}
		}
		return numClient;
	}

}
