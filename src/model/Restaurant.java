package model;

public class Restaurant {
	
	
	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private CalendrierAnnuel calendrierDeuxiemeService;
		int nbChaises;
		
		public Table(int nbChaises) {
			this.calendrierDeuxiemeService = new CalendrierAnnuel();
			this.nbChaises = nbChaises;
		}
		
		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			int numService = formulaire.getNumService();
			
			//TODO
			if (numService == 1) {
				calendrier.reserver(jour, mois);
				int numTable; // = cent
				return new ReservationRestaurant(jour, mois, numService, numTable);
			}
			
			
			return null; //Temp
		}
		
		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			int jour = formulaire.getJour();
			int mois = formulaire.getMois();
			int numService = formulaire.getNumService();
			boolean tableOK = nbChaises == formulaire.getNombrePersonnes();
			if (numService == 1) {
				return tableOK && (calendrier.estLibre(jour, mois));
			}
			return tableOK && (calendrierDeuxiemeService.estLibre(jour, mois));
		}
	}
}
