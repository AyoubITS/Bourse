package donnee;

import java.util.NoSuchElementException;
/**
 * 
 * @author Julien
 *
 */

/**
 * 
 * Créer une interface avec les méthodes ajouter,supprimer rechercher une entreprise, du nombre d'entreprise et si notre arrayList contient notre entreprise. 
 *
 */

public interface InterfaceEntreprise {
	void ajouter(Entreprise entreprise);
	Entreprise RechercherNom(String nom1) throws NoSuchElementException;
	void remove(Entreprise entreprise);
	int NombreEntreprise();
	boolean contains(Entreprise entreprise);

}
