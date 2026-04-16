package scenario;

import produit.Sanglier;
import villageGaulois.Etal;
import villageGaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		IEtal[] etals = new IEtal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		etals[0] = etalSanglier;
	}
}
