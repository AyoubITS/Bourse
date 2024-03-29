package donnee;

/**
 * 
 * @author Julien Veysseyre
 * @version 3.0
 */

/**
 * Utilisateur est la classe repr�sentant l'utilisateur qui pourra acheter et vendre des actions.
 * 
 * @param soldeActuel definit notre Solde de l'utilisateur soit 2000 euro.
 * @param pourcentagedetenuparlutilisateur definit notre pourcentage d�tenu dans l'entreprise.
 */

public class Utilisateur {
	private static double soldeActuel=2000;
	private int pourcentagedetenuparlutilisateur;
	
	/**
	 * retourne le soldeActuel
	 * @param soldeActuel definit notre Solde de l'utilisateur.
	 * 
	 */
	
	public Utilisateur(double soldeActuel) {
		Utilisateur.soldeActuel=soldeActuel;
	}
	
	/**
	 * permet d'obtenir  le soldeActuel
	 * @param soldeActuel definit notre Solde de l'utilisateur.
	 * 
	 */

	public static double getSoldeActuel() {
		return soldeActuel;
	}
	
	/**
	 * permet de changer  le soldeActuel
	 * @param soldeActuel definit notre Solde de l'utilisateur.
	 * 
	 */
	
	public static void setSoldeActuel(double soldeActuel) {
		Utilisateur.soldeActuel = soldeActuel;
	}
	
	/**
	 * permet d'obtenir  le pourcentage detenu par l'utilisateur
	 * @param pourcentagedetenuparlutilisateur d�finit le pourcentage detenu par l'utilisateur.
	 * 
	 */

	public int getPourcentagedetenuparlutilisateur() {
		return pourcentagedetenuparlutilisateur;
	}
	
	/**
	 * permet de changer  le pourcentage detenu par l'utilisateur
	 * @param pourcentagedetenuparlutilisateur d�finit le pourcentage detenu par l'utilisateur.
	 * 
	 */
	public void setPourcentagedetenuparlutilisateur(int pourcentagedetenuparlutilisateur) {
		this.pourcentagedetenuparlutilisateur = pourcentagedetenuparlutilisateur;
	}
	
	
	}


