package donnee;
/**
 * 
 * @author Julien
 *
 */

public class Entreprise {
	/**
	 * @param capital
	 * Instancie le capital de l'entreprise
	 * * @param secteur
	 * Instancie le secteur de l'entreprise
	 * * @param valeuraction
	 * Instancie la valeur de l'action de l'entreprise
	 * * @param pourcentagedetenuparen
	 * Instancie le pourcentage détenu par l'entreprise
	 */

private double capital;
private String nom;
private String secteur;
private double valeuraction;
private double pourcentagedetenuparen=100;


/**
 * Crée la méthode Entreprise pour créer un objet de type Entreprise.
 * @param capital
 * Instancie le capital de l'entreprise
 * * @param secteur
 * Instancie le secteur de l'entreprise
 * * @param valeuraction
 * Instancie la valeur de l'action de l'entreprise
 * * @param pourcentagedetenuparen
 * Instancie le pourcentage détenu par l'entreprise
 */
public Entreprise(String nom,int capital,String secteur,int valeuraction,int p) {
	
this.capital=capital;
this.nom=nom;
this.secteur=secteur;
this.valeuraction=valeuraction;
this.pourcentagedetenuparen=p;
}

/**
* Crée la méthode pour obtenir le capital.
* */
public double getCapital() {
return capital;
}

/**
* Crée la méthode pour changer le capital.
* @param capital
* */
public void setCapital(double d) {
this.capital = d;
}

/**
* Crée la méthode pour obtenir le nom de l'entreprise.
* */
public String getNom() {
return nom;
}

/**
* Crée la méthode pour changer le nom de l'entreprise.
* @param nom
* */
public void setNom(String nom) {
this.nom = nom;
}

/**
* Crée la méthode pour obtenir le secteur.
* */
public String getSecteur() {
return secteur;
}

/**
* Crée la méthode pour modifier le secteur.
* @param secteur
* */

public void setSecteur(String secteur) {
this.secteur = secteur;
}

/**
* Crée la méthode pour obtenir la valeur de l'action.
* */
public double getValeuraction() {
return valeuraction;
}

/**
* Crée la méthode pour changer la valeur de l'action.
* @param d est la variable pour changer la variable
* */
public void setValeuraction(double d) {
this.valeuraction = d;
}

/**
* Crée la méthode pour obtenir le pourcentage détenu par l'entreprise.
* */
public double getPourcentagedetenuparen() {
return pourcentagedetenuparen;
}

/**
* Crée la méthode pour changer le pourcentage détenu par l'entreprise.
* @param pourcentagedetenuparen
* */
public void setPourcentagedetenuparen(double pourcentagedetenuparen) {
this.pourcentagedetenuparen = pourcentagedetenuparen;
}

/**
 * Retourne les différentes valeur d'une Entreprise.
 */

@Override
public String toString() {
return "Entreprise [capital=" + capital + ", nom=" + nom + ", secteur=" + secteur + ", valeuraction="
+ valeuraction + ", pourcentagedetenuparen=" + pourcentagedetenuparen + "]";
}
}