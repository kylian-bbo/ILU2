package model;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		super(jour, mois);
		
		this.numZone = numZone;
		this.numChaise = numChaise;
	}

	@Override
	public String toString() {
		return ("Le " + jour + '/' + mois + " : chaise n°" + numChaise + " dans la zone " + numZone + "\n");
	}
}