package villagegaulois;

import personnages.Gaulois;

public class DepenseMarchand {
	private Gaulois marchand;
	private int qteVendue;
	private double sommeDepensee;
	private String produit;

	public DepenseMarchand(Gaulois marchand, int qteVendue, String produit, double sommeDepensee) {
		this.marchand = marchand;
		this.qteVendue = qteVendue;
		this.sommeDepensee = sommeDepensee;
		this.produit = produit;

		if (qteVendue > 1) {
			this.produit += "s";
		}
	}

	public String toString() {
		return "Achat de " + qteVendue + " " + produit + " sur l'étal du marchand " + marchand.getNom()
				+ " pour un total de " + sommeDepensee + " sous.\n";
	}

}
