package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous Ãªtes dÃ©jÃ  un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("ÃŠtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					System.out.println("Bienvenu villageois " + nomVisiteur);
					int force = Clavier.entrerEntier("Quelle est votre force ?");
					controlEmmenager.ajouterGaulois(nomVisiteur, force);
					break;

				default:
					System.out.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		int forceDruide, effetPotionMin, effetPotionMax;
		System.out.println("Bienvenu druide " + nomVisiteur);
		forceDruide = Clavier.entrerEntier("Quelle est votre force ?");
		effetPotionMin = Clavier.entrerEntier("Quelle est la force de potion la plus faible que vous produisez ?");
		effetPotionMax = Clavier.entrerEntier("Quelle est la force de potion la plus forte que vous produisez ?");
		while (effetPotionMin > effetPotionMax) {
			System.out.println("Attention Druide, vous vous êtes trompé entre le minimum et le maximum");
			effetPotionMin = Clavier.entrerEntier("Quelle est la force de potion la plus faible que vous produisez ?");
			effetPotionMax = Clavier.entrerEntier("Quelle est la force de potion la plus forte que vous produisez ?");
		}
		controlEmmenager.ajouterDuide(nomVisiteur, forceDruide, effetPotionMin, effetPotionMax);
	}
}
