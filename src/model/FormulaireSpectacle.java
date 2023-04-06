package model;

public class FormulaireSpectacle extends Formulaire {
	private int numZone;
	
	public FormulaireSpectacle(int jour, int mois, int numZone) {
		super(jour, mois);
		
		this.numZone = numZone;
	}
}