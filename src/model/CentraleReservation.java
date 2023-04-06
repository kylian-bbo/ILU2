package model;

public class CentraleReservation <E extends EntiteReservable<F>, F extends Formulaire> {
	private E[] entiteAReserver;
	private int nbEntite;
	
	public CentraleReservation(E[] entiteAReserver) {
		this.entiteAReserver = entiteAReserver;
		this.nbEntite = 0;
	}
	
	public int ajouterEntite(E entite) {
		entiteAReserver[nbEntite] = entite;
		return nbEntite += 1;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		//TODO
		
		return null;
	}
	
	public Reservation reserver(int numEntite, F formulaire) {
		//TODO
		EntiteReservable entite = entiteAReserver[numEntite];
		formulaire.setIdentificationEntite(entite.getNumero());
		
		return null;
	}
}