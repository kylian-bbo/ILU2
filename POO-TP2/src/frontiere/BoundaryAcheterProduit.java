package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		// TODO à completer
		
		if (controlAcheterProduit.estHabitant(nomAcheteur)) {

			System.out.println("Quel produit voulez-vous acheter ?");
			String produit = scan.next();
		
			if (controlAcheterProduit.estVendu(produit)) {
				System.out.println("Chez quel commerçant voulez-vous acheter des fleurs ?");
				
				String[] listeNomsVendeurs = controlAcheterProduit.obtenirListeNomsVendeurs(produit);
				//Afficher la liste des vendeurs
			
				//Entrer le numéro de vendeur souhaité
			
				//System.out.println(nomAcheteur + "se déplace jusqu'à l'étal du vendeur " + nomVendeur);
				//System.out.println("Bonjour " + nomAcheteur);
			
				//System.out.println("Combien de " + produit + "voulez-vous acheter ?");
				//Entrer la quantité à acheter
			
				//if achat possible
					//acheter
					//System.out.println(nomVendeur + " a acheté" + quantite + " de " + produit + " à " + nomVendeur);
				//else
					//System.out.println(nomVendeur + " n'a plus assez de " + produit + " à vendre.");
			}
			else
				System.out.println("Personne ne vend de " + produit + "au marché actuellement.");
		}
		else
			System.out.println("Vous ne pouvez pas acheter dans ce marché car vous n'êtes pas un habitant"
								+ " du village");
	}
}
