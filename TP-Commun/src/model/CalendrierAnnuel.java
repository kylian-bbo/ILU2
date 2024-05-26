package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		this.calendrier = new Mois[12];
		
		calendrier[0] = new Mois("Janvier",31);
		calendrier[1] = new Mois("Février",28);
		calendrier[2] = new Mois("Mars",31);
		calendrier[3] = new Mois("Avril",30);
		calendrier[4] = new Mois("Mai",31);
		calendrier[5] = new Mois("Juin",30);
		calendrier[6] = new Mois("Juillet",31);
		calendrier[7] = new Mois("Août",31);
		calendrier[8] = new Mois("Septembre",30);
		calendrier[9] = new Mois("Octobre",31);
		calendrier[10] = new Mois("Novembre",3);
		calendrier[11] = new Mois("Décembre",31);
	}
	
	public Boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public Boolean reserver(int jour, int mois) {
		if (estLibre(jour,mois)) {
			calendrier[mois-1].reserver(jour);
			return true;
		}
		return false;
	}
	
	
	private static class Mois {
		private String nom;
		private Boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new Boolean[nbJours];
			
			for (int i=0; i<nbJours; i++)
				jours[i] = false;
		}
		
		private Boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		private void reserver(int jour) {
			if (estLibre(jour))
				jours[jour-1] = true;
			else
				throw new IllegalStateException();
		}
	}
}