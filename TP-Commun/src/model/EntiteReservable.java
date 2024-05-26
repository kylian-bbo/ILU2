package model;

public abstract class EntiteReservable <F extends Formulaire> {
	protected CalendrierAnnuel calendrier;
	private int numero;

	public EntiteReservable() {
		this.calendrier = new CalendrierAnnuel();
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean estLibre(F formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}