package donnee;
import java.util.Iterator;
import java.util.Random;

/**
 * 
 * @author Julien Veysseyre
 * @version 3.0
 */

/**
 * 
 * Simulation est la classe qui permet a ce que des utilisateurs permettent d'int�ragir avec les actions d'achat et vente.
 *
 */

/**
 * Cr�e le singleton n�cessaire � la simulation.
 *
 */
public class Simulation {
	  ListEntreprise singleton1 = ListEntreprise.getInstance();
		
	  /**
	   *  C'est la m�thode permettant de simuler cette simulation.
	   **/
	public static void simul_entreprise() {
		ListEntreprise singleton = ListEntreprise.getInstance();
		Iterator<Entreprise> it = ListEntreprise.entreprises.iterator();
		System.out.println(ListEntreprise.entreprises.size());
		while(it.hasNext()) {
			Entreprise ent = it.next();
			double pourcentage = generer_pourcentage(0.80,1.2);
			singleton.modifier_capital_entreprise(pourcentage, ent.getNom());
			singleton.modifier_prix_action_entreprise(pourcentage, ent.getNom());
	
		}
	}
	
	  /**
	   *  C'est la m�thode permettant de g�nerer le pourcentage avec lequel les autres personnes peuvent alors int�ragir.
	   *  @param inf signifie le pourcentage inf�rieur pour lequel ils peuvent int�ragir.
	   *   @param sup signifie le pourcentage sup�rieur pour lequel ils peuvent int�ragir.
	   **/
	public static double generer_pourcentage (double inf, double sup) {
		Random rand = new Random();
		double nb = inf + (sup - inf) * rand.nextDouble();
		return nb;
		
	}
	
	/** 
	 * Permet de tester notre simulation
	 */
	
	@SuppressWarnings("static-access")
	public static void main(String[]args) {
		ListEntreprise singleton = ListEntreprise.getInstance();
		System.out.println(singleton.get_valeuraction_entreprise("Total"));
	}
}