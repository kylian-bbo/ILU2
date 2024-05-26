package produit;

public class Poisson extends Produit {
	private int poids;
	private String datePeche;
	
	public Poisson(int poids, String datePeche) {
		super("Poisson", Unite.kilogramme);
		this.datePeche = datePeche;
		this.poids = poids;
	}
	
	@Override
	public String descriptionProduit() {
		return nom + " péché " + datePeche;
	}
}
