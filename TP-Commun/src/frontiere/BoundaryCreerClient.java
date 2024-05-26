package frontiere;

import java.util.Scanner;

import control.ControlCreerClient;

public class BoundaryCreerClient {
	private ControlCreerClient controlCreerClient;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryCreerClient(ControlCreerClient controlCreerClient) {
		this.controlCreerClient = controlCreerClient;
	}

	public void creerClient() {
		System.out.println("Nom : ");
		String nom = scanner.next();
		System.out.println("Prénom : ");
		String prenom = scanner.next();
		System.out.println("Adresse mail : ");
		String adresseMail = scanner.next();
		System.out.println("Mot de Passe : ");
		String mdp = scanner.next();
		controlCreerClient.creerClient(nom, prenom, adresseMail, mdp);
	}
}