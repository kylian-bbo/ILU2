package model;

public class Formulaire {
	private int jour;
	private int mois;
	private int IdentificationEntite;
	
	public Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}
	
	public void setMois(int mois) {
		this.mois = mois;
	}
	
	public void setIdentificationEntite(int identificationEntite) {
		IdentificationEntite = identificationEntite;
	}
	
	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	public int getIdentificationEntite() {
		return IdentificationEntite;
	}
}