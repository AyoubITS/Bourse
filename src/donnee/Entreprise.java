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
	 * Instancie le pourcentage d�tenu par l'entreprise
	 */

private double capital;
private String nom;
private String secteur;
private double valeuraction;
private double pourcentagedetenuparen=100;


/**
 * Cr�e la m�thode Entreprise pour cr�er un objet de type Entreprise.
 * @param capital
 * Instancie le capital de l'entreprise
 * * @param secteur
 * Instancie le secteur de l'entreprise
 * * @param valeuraction
 * Instancie la valeur de l'action de l'entreprise
 * * @param pourcentagedetenuparen
 * Instancie le pourcentage d�tenu par l'entreprise
 */
public Entreprise(String nom,int capital,String secteur,int valeuraction,int p) {
	
this.capital=capital;
this.nom=nom;
this.secteur=secteur;
this.valeuraction=valeuraction;
this.pourcentagedetenuparen=p;
}

/**
* Cr�e la m�thode pour obtenir le capital.
* */
public double getCapital() {
return capital;
}

/**
* Cr�e la m�thode pour changer le capital.
* @param capital
* */
public void setCapital(double d) {
this.capital = d;
}

/**
* Cr�e la m�thode pour obtenir le nom de l'entreprise.
* */
public String getNom() {
return nom;
}

/**
* Cr�e la m�thode pour changer le nom de l'entreprise.
* @param nom
* */
public void setNom(String nom) {
this.nom = nom;
}

/**
* Cr�e la m�thode pour obtenir le secteur.
* */
public String getSecteur() {
return secteur;
}

/**
* Cr�e la m�thode pour modifier le secteur.
* @param secteur
* */

public void setSecteur(String secteur) {
this.secteur = secteur;
}

/**
* Cr�e la m�thode pour obtenir la valeur de l'action.
* */
public double getValeuraction() {
return valeuraction;
}

/**
* Cr�e la m�thode pour changer la valeur de l'action.
* @param d est la variable pour changer la variable
* */
public void setValeuraction(double d) {
this.valeuraction = d;
}

/**
* Cr�e la m�thode pour obtenir le pourcentage d�tenu par l'entreprise.
* */
public double getPourcentagedetenuparen() {
return pourcentagedetenuparen;
}

/**
* Cr�e la m�thode pour changer le pourcentage d�tenu par l'entreprise.
* @param pourcentagedetenuparen
* */
public void setPourcentagedetenuparen(double pourcentagedetenuparen) {
this.pourcentagedetenuparen = pourcentagedetenuparen;
}

/**
 * Retourne les diff�rentes valeur d'une Entreprise.
 */

@Override
public String toString() {
return "Entreprise [capital=" + capital + ", nom=" + nom + ", secteur=" + secteur + ", valeuraction="
+ valeuraction + ", pourcentagedetenuparen=" + pourcentagedetenuparen + "]";
}
}