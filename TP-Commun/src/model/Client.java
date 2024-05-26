package model;

public class Client {
	private String nom;
	private String prenom;
	private String adresseMail;
	private String mdp;

	public Client(String nom, String prenom, String adresseMail, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresseMail = adresseMail;
		this.mdp = mdp;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public boolean connecterClient(String mdp) {
		return mdp.equals(this.mdp);
	}

	// UNIQUEMENT POUR VERIFICATION
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("nom=" + nom + ", prenom=" + prenom);
		chaine.append(", adresseMail=" + adresseMail + ", mdp=" + mdp);
		return chaine.toString();
	}
}