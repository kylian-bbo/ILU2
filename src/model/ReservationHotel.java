package model;

public class ReservationHotel extends Reservation {
	public int nbLitSimple;
	public int nbLitDouble;
	public int numChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numChambre) {
		super(jour, mois);
		
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
	}

	@Override
	public String toString() {
		return ("Le " + jour + '/' + mois + " : chambre n°" + numChambre + " avec " + nbLitSimple 
				+ " lit(s) simple(s) et " + nbLitDouble  + " lit(s) double(s).\n");
	}
}