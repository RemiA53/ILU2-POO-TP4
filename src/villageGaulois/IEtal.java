package villageGaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	Produit getProduit();

	void occuperEtal(Gaulois vendeur, Produit produit, int quantite);

	boolean contientProduit(String produit);

	int acheterProduit(int quantiteAcheter);

	void libererEtal();

	String[] etatEtal();

}