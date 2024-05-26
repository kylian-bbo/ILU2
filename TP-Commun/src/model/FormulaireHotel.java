package model;

public class FormulaireHotel extends Formulaire {
	private int nbLitSimple;
	private int nbLitDouble;
	
	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble) {
		super(jour, mois);
		
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}
}