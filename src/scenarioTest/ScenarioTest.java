package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtal;
import personnages.Gaulois;
import produit.Produit;
import produit.Sanglier;
import produit.Poisson;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
		
		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson(12, "lundi"), 10);
	}
}