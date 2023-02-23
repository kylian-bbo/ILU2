package villagegaulois;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private Marche marche;

	public Village(String nom, int nbVillageoisMaximum, int nbEtals) {
		this.nom = nom;
		this.marche = new Marche(nbEtals);
		villageois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}

	public Gaulois trouverHabitant(String nomGaulois) {
		if (nomGaulois.equals(chef.getNom())) {
			return chef;
		}
		for (int i = 0; i < nbVillageois; i++) {
			Gaulois gaulois = villageois[i];
			if (gaulois.getNom().equals(nomGaulois)) {
				return gaulois;
			}
		}
		return null;
	}

	public String afficherVillageois() {
		StringBuilder chaine = new StringBuilder();
		if (nbVillageois < 1) {
			chaine.append("Il n'y a encore aucun habitant au village du chef "
					+ chef.getNom() + ".\n");
		} else {
			chaine.append("Au village du chef " + chef.getNom()
					+ " vivent les légendaires gaulois :\n");
			for (int i = 0; i < nbVillageois; i++) {
				chaine.append("- " + villageois[i].getNom() + "\n");
			}
		}
		return chaine.toString();
	}
	
	private static class Marche {
		private Etal[] etals;
		
		public Marche(int nbEtal) {
			this.etals = new Etal[nbEtal];
			for (int i=0; i<nbEtal; i++) {
				etals[i] = new Etal();
			}
		}
		
		private void utiliserEtal(int indiceEtal, Gaulois vendeur, String produit, int nbProduit) {
			etals[indiceEtal].occuperEtal(vendeur,produit,nbProduit);
		}
		
		private int trouverEtalLibre() {
			int indiceEtalDispo = -1;
			int i = 0;
			while (indiceEtalDispo==-1 && i<etals.length) {
				if (!etals[i].isEtalOccupe())
					indiceEtalDispo = i;
				i++;
			}
			return indiceEtalDispo;
		}
		
		Etal[] trouverEtals(String produit) {
			int nbEtalsVendantProduit = 0;
			for (int i=0; i<etals.length; i++) {
				if (etals[i].contientProduit(produit) && etals[i].isEtalOccupe())
					nbEtalsVendantProduit++;
			}
			Etal[] etalsVendantProduit = new Etal[nbEtalsVendantProduit];
			int iTab = 0;
			for (int i=0; i<etals.length; i++) {
				if (etals[i].contientProduit(produit) && etals[i].isEtalOccupe())
					etalsVendantProduit[iTab] = etals[i];
				iTab++;
			}
			return etalsVendantProduit;
		}
		
		private Etal trouverVendeur(Gaulois gaulois) {
			for (int i=0; i<etals.length; i++) {
				if (etals[i].getVendeur() == gaulois)
					return etals[i];
			}
			return null;
		}
		
		private void afficherMarche() {
			int nbEtalsVide = 0;
			for (int i=0; i<etals.length; i++) {
				if (etals[i] == null)
					nbEtalsVide++;
				else
					etals[i].afficherEtal();
			}
			if (nbEtalsVide>0)
				System.out.println("Il reste " + nbEtalsVide + "  �tals non utilis�s dans le march�.");
		}
	}

	public String installerVendeur(Gaulois vendeur, String produit,int nbProduit) {
		StringBuilder chaine = new StringBuilder();
		int indEtalLibre = marche.trouverEtalLibre();
		
		chaine.append(vendeur.getNom() + " cherche un endroit pour vendre " + nbProduit + ' ' + produit +".\n");
		
		if (indEtalLibre == -1)
			chaine.append("Il n'y a plus d'etals disponibles.\n");
		else {
			marche.utiliserEtal(indEtalLibre, vendeur, produit, nbProduit);
			chaine.append("Le vendeur " + vendeur.getNom() + " vend des " + produit + " a l'etal n°" + (indEtalLibre + 1) + ".\n");
		}
		
		return chaine.toString();
	}
}