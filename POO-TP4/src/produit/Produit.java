package produit;

public abstract class Produit {
	
	protected String nom;
	protected Unite unite;
	
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract String descriptionProduit();
}