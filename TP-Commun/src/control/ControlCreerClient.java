package control;

import model.CarnetClientele;

public class ControlCreerClient {
	private CarnetClientele carnetClientel;

	public ControlCreerClient(CarnetClientele carnetClientel) {
		this.carnetClientel = carnetClientel;
	}

	public void creerClient(String nom, String prenom, String adresseMail, String mdp) {
		carnetClientel.creerClient(nom, prenom, adresseMail, mdp);
	}
}