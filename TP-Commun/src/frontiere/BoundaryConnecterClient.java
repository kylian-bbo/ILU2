package frontiere;

import java.util.Scanner;

import control.ControlConnecterClient;

public class BoundaryConnecterClient {
	private ControlConnecterClient controlConnecterClient;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryConnecterClient(ControlConnecterClient controlConnecterClient) {
		this.controlConnecterClient = controlConnecterClient;
	}

	public int connecterClient() {
		System.out.println("Adresse mail : ");
		String adresseMail = scanner.next();
		System.out.println("Mot de passe : ");
		String mdp = scanner.next();
		int numClient = controlConnecterClient.connecterClient(adresseMail, mdp);
		if (numClient != -1) {
			System.out.println("Vous êtes connecté");
		} else {
			System.out.println("Votre mail ou votre mot de passe est erroné");
		}
		return numClient;
	}
}