package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;
import produit.Produit;
import produit.Sanglier;
import produit.Poisson;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal<Sanglier>[] marche = new IEtal[3];
		IEtal<Sanglier> etalSanglier = new Etal<>();
		marche[0] = etalSanglier;
	}
}