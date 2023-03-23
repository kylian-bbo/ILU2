package scenarioTest;

import villagegaulois.Etal;
import produit.Produit;
import produit.Sanglier;
import produit.Poisson;

public class ScenarioTest {
	public static void main(String[] args) {
		Etal[] marche = new Etal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
	}
	
}