package controleur;

import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}

	//TODO a completer
	
	public Boolean estHabitant(String nomAcheteur) {
		return controlVerifierIdentite.verifierIdentite(nomAcheteur);
	}
	
	public Boolean estVendu(String produit) {
		return village.rechercherVendeursProduit(produit) != null;
	}
	
	public String[] obtenirListeNomsVendeurs(String produit) {
		
		int nbEtals = village.donnerNbEtal();
		int i=0;
		String[] listeNomsVendeurs = new String[nbEtals];
		String[] donneesMarche = village.donnerEtatMarche();
		
		for (int j=2;i<(donneesMarche.length);j=j+3) {
			if (donneesMarche[i] == produit) {
				listeNomsVendeurs[i] = donneesMarche[i-1];
				i++;
			}
		}

		return listeNomsVendeurs;
	}
}
