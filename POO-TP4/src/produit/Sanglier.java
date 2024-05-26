package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(Unite unite, int poids, Gaulois chasseur) {
		super("Sanglier", unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}
	
	@Override
	public String descriptionProduit() {
		return nom + " de " + poids + unite + "chassé par " + chasseur.getNom();
	}
}
